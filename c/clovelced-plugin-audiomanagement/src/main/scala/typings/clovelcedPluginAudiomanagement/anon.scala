package typings.clovelcedPluginAudiomanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AudioMode extends StObject {
    
    var audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode = js.native
    
    var label: String = js.native
  }
  object AudioMode {
    
    @scala.inline
    def apply(audioMode: typings.clovelcedPluginAudiomanagement.mod.AudioMode, label: String): AudioMode = {
      val __obj = js.Dynamic.literal(audioMode = audioMode.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioMode]
    }
    
    @scala.inline
    implicit class AudioModeMutableBuilder[Self <: AudioMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioMode(value: typings.clovelcedPluginAudiomanagement.mod.AudioMode): Self = StObject.set(x, "audioMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxVolume extends StObject {
    
    var maxVolume: Double = js.native
  }
  object MaxVolume {
    
    @scala.inline
    def apply(maxVolume: Double): MaxVolume = {
      val __obj = js.Dynamic.literal(maxVolume = maxVolume.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxVolume]
    }
    
    @scala.inline
    implicit class MaxVolumeMutableBuilder[Self <: MaxVolume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxVolume(value: Double): Self = StObject.set(x, "maxVolume", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Volume extends StObject {
    
    var volume: Double = js.native
  }
  object Volume {
    
    @scala.inline
    def apply(volume: Double): Volume = {
      val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[Volume]
    }
    
    @scala.inline
    implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
}
