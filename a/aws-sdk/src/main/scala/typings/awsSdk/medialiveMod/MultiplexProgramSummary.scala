package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexProgramSummary extends StObject {
  
  /**
    * The MediaLive Channel associated with the program.
    */
  var ChannelId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the multiplex program.
    */
  var ProgramName: js.UndefOr[string] = js.undefined
}
object MultiplexProgramSummary {
  
  inline def apply(): MultiplexProgramSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexProgramSummary]
  }
  
  extension [Self <: MultiplexProgramSummary](x: Self) {
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setProgramNameUndefined: Self = StObject.set(x, "ProgramName", js.undefined)
  }
}
