package typings.cordovaPluginMedia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  iOS optional parameters for media.play
  *  See https://github.com/apache/cordova-plugin-media#ios-quirks
  */
trait IosPlayOptions extends StObject {
  
  var numberOfLoops: js.UndefOr[Double] = js.undefined
  
  var playAudioWhenScreenIsLocked: js.UndefOr[Boolean] = js.undefined
}
object IosPlayOptions {
  
  inline def apply(): IosPlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosPlayOptions]
  }
  
  extension [Self <: IosPlayOptions](x: Self) {
    
    inline def setNumberOfLoops(value: Double): Self = StObject.set(x, "numberOfLoops", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLoopsUndefined: Self = StObject.set(x, "numberOfLoops", js.undefined)
    
    inline def setPlayAudioWhenScreenIsLocked(value: Boolean): Self = StObject.set(x, "playAudioWhenScreenIsLocked", value.asInstanceOf[js.Any])
    
    inline def setPlayAudioWhenScreenIsLockedUndefined: Self = StObject.set(x, "playAudioWhenScreenIsLocked", js.undefined)
  }
}
