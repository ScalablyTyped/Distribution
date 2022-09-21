package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.CommandIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  /**
    * Which command(s) should have their output hidden.
    */
  var hide: js.UndefOr[CommandIdentifier | js.Array[CommandIdentifier]] = js.undefined
  
  /**
    * The prefix format to use when logging a command's output.
    * Defaults to the command's index.
    */
  var prefixFormat: js.UndefOr[String] = js.undefined
  
  /**
    * How many characters should a prefix have at most, used when the prefix format is `command`.
    */
  var prefixLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether output should be formatted to include prefixes and whether "event" logs will be
    * logged.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Date format used when logging date/time.
    * @see https://date-fns.org/v2.0.1/docs/format
    */
  var timestampFormat: js.UndefOr[String] = js.undefined
}
object Hide {
  
  inline def apply(): Hide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hide]
  }
  
  extension [Self <: Hide](x: Self) {
    
    inline def setHide(value: CommandIdentifier | js.Array[CommandIdentifier]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHideVarargs(value: CommandIdentifier*): Self = StObject.set(x, "hide", js.Array(value*))
    
    inline def setPrefixFormat(value: String): Self = StObject.set(x, "prefixFormat", value.asInstanceOf[js.Any])
    
    inline def setPrefixFormatUndefined: Self = StObject.set(x, "prefixFormat", js.undefined)
    
    inline def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
    
    inline def setPrefixLengthUndefined: Self = StObject.set(x, "prefixLength", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
  }
}
