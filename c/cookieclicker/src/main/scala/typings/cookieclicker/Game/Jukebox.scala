package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jukebox extends StObject {
  
  def musicScrub(time: Double): Unit
  
  var onSound: Double
  
  var onTrack: Double
  
  def pressLoopMusic(): Unit
  
  def pressMusicAuto(): Unit
  
  def pressMusicShuffle(): Unit
  
  def pressPlayMusic(): Unit
  
  def reset(): Unit
  
  def setSound(id: Double): Unit
  
  def setTrack(id: Double, dontPlay: Boolean): Unit
  
  var sounds: js.Array[String]
  
  var trackAuto: Boolean
  
  var trackLooped: Boolean
  
  var trackShuffle: Boolean
  
  var tracks: js.Array[Any]
  
  def updateMusicCurrentTime(noLoop: Boolean): Unit
}
object Jukebox {
  
  inline def apply(
    musicScrub: Double => Unit,
    onSound: Double,
    onTrack: Double,
    pressLoopMusic: () => Unit,
    pressMusicAuto: () => Unit,
    pressMusicShuffle: () => Unit,
    pressPlayMusic: () => Unit,
    reset: () => Unit,
    setSound: Double => Unit,
    setTrack: (Double, Boolean) => Unit,
    sounds: js.Array[String],
    trackAuto: Boolean,
    trackLooped: Boolean,
    trackShuffle: Boolean,
    tracks: js.Array[Any],
    updateMusicCurrentTime: Boolean => Unit
  ): Jukebox = {
    val __obj = js.Dynamic.literal(musicScrub = js.Any.fromFunction1(musicScrub), onSound = onSound.asInstanceOf[js.Any], onTrack = onTrack.asInstanceOf[js.Any], pressLoopMusic = js.Any.fromFunction0(pressLoopMusic), pressMusicAuto = js.Any.fromFunction0(pressMusicAuto), pressMusicShuffle = js.Any.fromFunction0(pressMusicShuffle), pressPlayMusic = js.Any.fromFunction0(pressPlayMusic), reset = js.Any.fromFunction0(reset), setSound = js.Any.fromFunction1(setSound), setTrack = js.Any.fromFunction2(setTrack), sounds = sounds.asInstanceOf[js.Any], trackAuto = trackAuto.asInstanceOf[js.Any], trackLooped = trackLooped.asInstanceOf[js.Any], trackShuffle = trackShuffle.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], updateMusicCurrentTime = js.Any.fromFunction1(updateMusicCurrentTime))
    __obj.asInstanceOf[Jukebox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jukebox] (val x: Self) extends AnyVal {
    
    inline def setMusicScrub(value: Double => Unit): Self = StObject.set(x, "musicScrub", js.Any.fromFunction1(value))
    
    inline def setOnSound(value: Double): Self = StObject.set(x, "onSound", value.asInstanceOf[js.Any])
    
    inline def setOnTrack(value: Double): Self = StObject.set(x, "onTrack", value.asInstanceOf[js.Any])
    
    inline def setPressLoopMusic(value: () => Unit): Self = StObject.set(x, "pressLoopMusic", js.Any.fromFunction0(value))
    
    inline def setPressMusicAuto(value: () => Unit): Self = StObject.set(x, "pressMusicAuto", js.Any.fromFunction0(value))
    
    inline def setPressMusicShuffle(value: () => Unit): Self = StObject.set(x, "pressMusicShuffle", js.Any.fromFunction0(value))
    
    inline def setPressPlayMusic(value: () => Unit): Self = StObject.set(x, "pressPlayMusic", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetSound(value: Double => Unit): Self = StObject.set(x, "setSound", js.Any.fromFunction1(value))
    
    inline def setSetTrack(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setTrack", js.Any.fromFunction2(value))
    
    inline def setSounds(value: js.Array[String]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
    
    inline def setSoundsVarargs(value: String*): Self = StObject.set(x, "sounds", js.Array(value*))
    
    inline def setTrackAuto(value: Boolean): Self = StObject.set(x, "trackAuto", value.asInstanceOf[js.Any])
    
    inline def setTrackLooped(value: Boolean): Self = StObject.set(x, "trackLooped", value.asInstanceOf[js.Any])
    
    inline def setTrackShuffle(value: Boolean): Self = StObject.set(x, "trackShuffle", value.asInstanceOf[js.Any])
    
    inline def setTracks(value: js.Array[Any]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksVarargs(value: Any*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setUpdateMusicCurrentTime(value: Boolean => Unit): Self = StObject.set(x, "updateMusicCurrentTime", js.Any.fromFunction1(value))
  }
}
