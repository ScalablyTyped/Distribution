package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.undefined
}
object GetOutpostOutput {
  
  @scala.inline
  def apply(): GetOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostOutput]
  }
  
  @scala.inline
  implicit class GetOutpostOutputMutableBuilder[Self <: GetOutpostOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
