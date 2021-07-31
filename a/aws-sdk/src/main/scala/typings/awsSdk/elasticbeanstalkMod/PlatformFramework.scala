package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformFramework extends StObject {
  
  /**
    * The name of the framework.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the framework.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object PlatformFramework {
  
  @scala.inline
  def apply(): PlatformFramework = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformFramework]
  }
  
  @scala.inline
  implicit class PlatformFrameworkMutableBuilder[Self <: PlatformFramework] (val x: Self) extends AnyVal {
    
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
