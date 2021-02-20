package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAliasOutput extends StObject {
  
  /**
    * The updated alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.native
}
object UpdateAliasOutput {
  
  @scala.inline
  def apply(): UpdateAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAliasOutput]
  }
  
  @scala.inline
  implicit class UpdateAliasOutputMutableBuilder[Self <: UpdateAliasOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
