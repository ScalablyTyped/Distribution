package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.native
}
object CreateOutpostOutput {
  
  @scala.inline
  def apply(): CreateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOutpostOutput]
  }
  
  @scala.inline
  implicit class CreateOutpostOutputMutableBuilder[Self <: CreateOutpostOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
