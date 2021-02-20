package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineVersion extends StObject {
  
  /**
    * Id for the version.
    */
  var Name: js.UndefOr[string] = js.native
}
object EngineVersion {
  
  @scala.inline
  def apply(): EngineVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineVersion]
  }
  
  @scala.inline
  implicit class EngineVersionMutableBuilder[Self <: EngineVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
