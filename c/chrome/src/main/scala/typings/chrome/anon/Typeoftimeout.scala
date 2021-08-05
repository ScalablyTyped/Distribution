package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftimeout extends StObject {
  
  var editTracksInfo: Double
  
  var getStatus: Double
  
  var load: Double
  
  var pause: Double
  
  var play: Double
  
  var queueInsert: Double
  
  var queueLoad: Double
  
  var queueRemove: Double
  
  var queueReorder: Double
  
  var queueUpdate: Double
  
  var seek: Double
  
  var setVolume: Double
  
  var stop: Double
}
object Typeoftimeout {
  
  inline def apply(
    editTracksInfo: Double,
    getStatus: Double,
    load: Double,
    pause: Double,
    play: Double,
    queueInsert: Double,
    queueLoad: Double,
    queueRemove: Double,
    queueReorder: Double,
    queueUpdate: Double,
    seek: Double,
    setVolume: Double,
    stop: Double
  ): Typeoftimeout = {
    val __obj = js.Dynamic.literal(editTracksInfo = editTracksInfo.asInstanceOf[js.Any], getStatus = getStatus.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], queueInsert = queueInsert.asInstanceOf[js.Any], queueLoad = queueLoad.asInstanceOf[js.Any], queueRemove = queueRemove.asInstanceOf[js.Any], queueReorder = queueReorder.asInstanceOf[js.Any], queueUpdate = queueUpdate.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setVolume = setVolume.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftimeout]
  }
  
  extension [Self <: Typeoftimeout](x: Self) {
    
    inline def setEditTracksInfo(value: Double): Self = StObject.set(x, "editTracksInfo", value.asInstanceOf[js.Any])
    
    inline def setGetStatus(value: Double): Self = StObject.set(x, "getStatus", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Double): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Double): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setQueueInsert(value: Double): Self = StObject.set(x, "queueInsert", value.asInstanceOf[js.Any])
    
    inline def setQueueLoad(value: Double): Self = StObject.set(x, "queueLoad", value.asInstanceOf[js.Any])
    
    inline def setQueueRemove(value: Double): Self = StObject.set(x, "queueRemove", value.asInstanceOf[js.Any])
    
    inline def setQueueReorder(value: Double): Self = StObject.set(x, "queueReorder", value.asInstanceOf[js.Any])
    
    inline def setQueueUpdate(value: Double): Self = StObject.set(x, "queueUpdate", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: Double): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    inline def setSetVolume(value: Double): Self = StObject.set(x, "setVolume", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
