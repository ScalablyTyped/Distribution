package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLChannel extends StObject {
  
  /**
    * You can use Gzip or None. The default value is None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.sagemakerMod.CompressionType] = js.undefined
  
  /**
    * The data source.
    */
  var DataSource: AutoMLDataSource
  
  /**
    * The name of the target variable in supervised learning, a.k.a. 'y'.
    */
  var TargetAttributeName: typings.awsSdk.sagemakerMod.TargetAttributeName
}
object AutoMLChannel {
  
  inline def apply(DataSource: AutoMLDataSource, TargetAttributeName: TargetAttributeName): AutoMLChannel = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLChannel]
  }
  
  extension [Self <: AutoMLChannel](x: Self) {
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setDataSource(value: AutoMLDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setTargetAttributeName(value: TargetAttributeName): Self = StObject.set(x, "TargetAttributeName", value.asInstanceOf[js.Any])
  }
}
