package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShimmerType extends StObject {
  
  def getMaxTime(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def getMinTime(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def initFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  var maxTime: Double
  
  var minTime: Double
  
  def missFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def popFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
  
  def reset(): Unit
  
  def spawnConditions(): Boolean
  
  var spawned: Boolean | PseudoBoolean
  
  var spawnsOnTimer: Boolean
  
  var time: Double
  
  def updateFunc(me: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit
}
object ShimmerType {
  
  inline def apply(
    getMaxTime: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    getMinTime: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    initFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    maxTime: Double,
    minTime: Double,
    missFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    popFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    reset: () => Unit,
    spawnConditions: () => Boolean,
    spawned: Boolean | PseudoBoolean,
    spawnsOnTimer: Boolean,
    time: Double,
    updateFunc: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
  ): ShimmerType = {
    val __obj = js.Dynamic.literal(getMaxTime = js.Any.fromFunction1(getMaxTime), getMinTime = js.Any.fromFunction1(getMinTime), initFunc = js.Any.fromFunction1(initFunc), maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], missFunc = js.Any.fromFunction1(missFunc), popFunc = js.Any.fromFunction1(popFunc), reset = js.Any.fromFunction0(reset), spawnConditions = js.Any.fromFunction0(spawnConditions), spawned = spawned.asInstanceOf[js.Any], spawnsOnTimer = spawnsOnTimer.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updateFunc = js.Any.fromFunction1(updateFunc))
    __obj.asInstanceOf[ShimmerType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShimmerType] (val x: Self) extends AnyVal {
    
    inline def setGetMaxTime(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "getMaxTime", js.Any.fromFunction1(value))
    
    inline def setGetMinTime(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "getMinTime", js.Any.fromFunction1(value))
    
    inline def setInitFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "initFunc", js.Any.fromFunction1(value))
    
    inline def setMaxTime(value: Double): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setMinTime(value: Double): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    inline def setMissFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "missFunc", js.Any.fromFunction1(value))
    
    inline def setPopFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "popFunc", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSpawnConditions(value: () => Boolean): Self = StObject.set(x, "spawnConditions", js.Any.fromFunction0(value))
    
    inline def setSpawned(value: Boolean | PseudoBoolean): Self = StObject.set(x, "spawned", value.asInstanceOf[js.Any])
    
    inline def setSpawnsOnTimer(value: Boolean): Self = StObject.set(x, "spawnsOnTimer", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUpdateFunc(
      value: shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = StObject.set(x, "updateFunc", js.Any.fromFunction1(value))
  }
}
