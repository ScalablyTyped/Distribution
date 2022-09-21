package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetOrgAttributes extends StObject {
  
  /**
    * The generation data group of the data set.
    */
  var gdg: js.UndefOr[GdgAttributes] = js.undefined
  
  /**
    * The details of a VSAM data set.
    */
  var vsam: js.UndefOr[VsamAttributes] = js.undefined
}
object DatasetOrgAttributes {
  
  inline def apply(): DatasetOrgAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetOrgAttributes]
  }
  
  extension [Self <: DatasetOrgAttributes](x: Self) {
    
    inline def setGdg(value: GdgAttributes): Self = StObject.set(x, "gdg", value.asInstanceOf[js.Any])
    
    inline def setGdgUndefined: Self = StObject.set(x, "gdg", js.undefined)
    
    inline def setVsam(value: VsamAttributes): Self = StObject.set(x, "vsam", value.asInstanceOf[js.Any])
    
    inline def setVsamUndefined: Self = StObject.set(x, "vsam", js.undefined)
  }
}
