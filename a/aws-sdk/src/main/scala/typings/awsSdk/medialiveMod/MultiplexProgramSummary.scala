package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiplexProgramSummary extends StObject {
  
  /**
    * The MediaLive Channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.native
  
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.native
}
object MultiplexProgramSummary {
  
  @scala.inline
  def apply(): MultiplexProgramSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramSummary]
  }
  
  @scala.inline
  implicit class MultiplexProgramSummaryMutableBuilder[Self <: MultiplexProgramSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    @scala.inline
    def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNameUndefined: Self = StObject.set(x, "ProgramName", js.undefined)
  }
}
