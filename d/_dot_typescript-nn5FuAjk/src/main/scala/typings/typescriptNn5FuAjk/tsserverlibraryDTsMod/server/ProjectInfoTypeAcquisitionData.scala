package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInfoTypeAcquisitionData extends StObject {
  
  val enable: js.UndefOr[Boolean] = js.undefined
  
  val exclude: Boolean
  
  val include: Boolean
}
object ProjectInfoTypeAcquisitionData {
  
  inline def apply(exclude: Boolean, include: Boolean): ProjectInfoTypeAcquisitionData = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfoTypeAcquisitionData]
  }
  
  extension [Self <: ProjectInfoTypeAcquisitionData](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
  }
}
