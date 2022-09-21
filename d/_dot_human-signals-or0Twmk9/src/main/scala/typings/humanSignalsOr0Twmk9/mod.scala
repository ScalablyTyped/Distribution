package typings.humanSignalsOr0Twmk9

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait Signal extends StObject {
    
    /**
      * What is the default action for this signal when it is not handled.
      */
    var action: SignalAction
    
    /**
      * Human-friendly description for the signal, for example 'User interruption with CTRL-C'.
      */
    var description: String
    
    /**
      * Whether the signal's default action cannot be prevented. This is true for SIGTERM, SIGKILL and SIGSTOP.
      */
    var forced: Boolean
    
    /**
      * Standard name of the signal, for example 'SIGINT'.
      */
    var name: String
    
    /**
      * Code number of the signal, for example 2. While most number are cross-platform, some are different between different OS.
      */
    var number: Double
    
    /**
      * Which standard defined that signal.
      */
    var standard: SignalStandard
    
    /**
      * Whether the current OS can handle this signal in Node.js using process.on(name, handler). The list of supported signals is OS-specific.
      */
    var supported: Boolean
  }
  object Signal {
    
    inline def apply(
      action: SignalAction,
      description: String,
      forced: Boolean,
      name: String,
      number: Double,
      standard: SignalStandard,
      supported: Boolean
    ): Signal = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signal]
    }
    
    extension [Self <: Signal](x: Self) {
      
      inline def setAction(value: SignalAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setForced(value: Boolean): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: SignalStandard): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.terminate
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.core
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ignore
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.pause
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.unpause
  */
  trait SignalAction extends StObject
  object SignalAction {
    
    inline def core: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.core = "core".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.core]
    
    inline def ignore: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ignore = "ignore".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ignore]
    
    inline def pause: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.pause = "pause".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.pause]
    
    inline def terminate: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.terminate = "terminate".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.terminate]
    
    inline def unpause: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.unpause = "unpause".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.unpause]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ansi
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.posix
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.bsd
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.systemv
    - typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.other
  */
  trait SignalStandard extends StObject
  object SignalStandard {
    
    inline def ansi: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ansi = "ansi".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.ansi]
    
    inline def bsd: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.bsd = "bsd".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.bsd]
    
    inline def other: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.other = "other".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.other]
    
    inline def posix: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.posix = "posix".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.posix]
    
    inline def systemv: typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.systemv = "systemv".asInstanceOf[typings.humanSignalsOr0Twmk9.humanSignalsOr0Twmk9Strings.systemv]
  }
}
