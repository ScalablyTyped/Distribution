package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasOutput extends StObject {
  
  /**
    * The newly created alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.undefined
}
object CreateAliasOutput {
  
  @scala.inline
  def apply(): CreateAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAliasOutput]
  }
  
  @scala.inline
  implicit class CreateAliasOutputMutableBuilder[Self <: CreateAliasOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
