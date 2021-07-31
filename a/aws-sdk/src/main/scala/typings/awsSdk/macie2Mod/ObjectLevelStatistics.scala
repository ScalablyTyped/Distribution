package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLevelStatistics extends StObject {
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects don't have a file name extension for a supported file or storage format.
    */
  var fileType: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an unsupported storage class.
    */
  var storageClass: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size (in bytes) or number of objects that Amazon Macie can't analyze because the objects use an unsupported storage class or don't have a file name extension for a supported file or storage format.
    */
  var total: js.UndefOr[long] = js.undefined
}
object ObjectLevelStatistics {
  
  @scala.inline
  def apply(): ObjectLevelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLevelStatistics]
  }
  
  @scala.inline
  implicit class ObjectLevelStatisticsMutableBuilder[Self <: ObjectLevelStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileType(value: long): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setStorageClass(value: long): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setTotal(value: long): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
