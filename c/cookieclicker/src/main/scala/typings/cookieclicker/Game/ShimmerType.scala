package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShimmerType extends js.Object {
  
  def getMaxTime(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
  
  def getMinTime(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
  
  def initFunc(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
  
  var maxTime: Double = js.native
  
  var minTime: Double = js.native
  
  def missFunc(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
  
  def popFunc(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def spawnConditions(): Boolean = js.native
  
  var spawned: Boolean | PseudoBoolean = js.native
  
  var spawnsOnTimer: Boolean = js.native
  
  var time: Double = js.native
  
  def updateFunc(me: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]): Unit = js.native
}
object ShimmerType {
  
  @scala.inline
  def apply(
    getMaxTime: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    getMinTime: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    initFunc: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    maxTime: Double,
    minTime: Double,
    missFunc: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    popFunc: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit,
    reset: () => Unit,
    spawnConditions: () => Boolean,
    spawned: Boolean | PseudoBoolean,
    spawnsOnTimer: Boolean,
    time: Double,
    updateFunc: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
  ): ShimmerType = {
    val __obj = js.Dynamic.literal(getMaxTime = js.Any.fromFunction1(getMaxTime), getMinTime = js.Any.fromFunction1(getMinTime), initFunc = js.Any.fromFunction1(initFunc), maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any], missFunc = js.Any.fromFunction1(missFunc), popFunc = js.Any.fromFunction1(popFunc), reset = js.Any.fromFunction0(reset), spawnConditions = js.Any.fromFunction0(spawnConditions), spawned = spawned.asInstanceOf[js.Any], spawnsOnTimer = spawnsOnTimer.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updateFunc = js.Any.fromFunction1(updateFunc))
    __obj.asInstanceOf[ShimmerType]
  }
  
  @scala.inline
  implicit class ShimmerTypeOps[Self <: ShimmerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetMaxTime(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("getMaxTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMinTime(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("getMinTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitFunc(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("initFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxTime(value: Double): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTime(value: Double): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissFunc(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("missFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPopFunc(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("popFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpawnConditions(value: () => Boolean): Self = this.set("spawnConditions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpawned(value: Boolean | PseudoBoolean): Self = this.set("spawned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpawnsOnTimer(value: Boolean): Self = this.set("spawnsOnTimer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFunc(
      value: Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object] => Unit
    ): Self = this.set("updateFunc", js.Any.fromFunction1(value))
  }
}
