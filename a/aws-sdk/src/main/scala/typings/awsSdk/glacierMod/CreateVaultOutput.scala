package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVaultOutput extends StObject {
  
  /**
    * The URI of the vault that was created.
    */
  var location: js.UndefOr[String] = js.undefined
}
object CreateVaultOutput {
  
  @scala.inline
  def apply(): CreateVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVaultOutput]
  }
  
  @scala.inline
  implicit class CreateVaultOutputMutableBuilder[Self <: CreateVaultOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
