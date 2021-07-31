package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportedOs extends StObject {
  
  /**
    * The operating system family.
    */
  var Family: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The operating system version.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object ReportedOs {
  
  @scala.inline
  def apply(): ReportedOs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportedOs]
  }
  
  @scala.inline
  implicit class ReportedOsMutableBuilder[Self <: ReportedOs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
