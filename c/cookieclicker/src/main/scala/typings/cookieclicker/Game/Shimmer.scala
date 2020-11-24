package typings.cookieclicker.Game

import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shimmer[N /* <: String */, C /* <: js.Object */] extends js.Object {
  
  def die(): Unit = js.native
  
  var forceObj: C = js.native
  
  var id: Double = js.native
  
  def init(): Unit = js.native
  
  var l: HTMLElement = js.native
  
  var noCount: Boolean = js.native
  
  def pop(event: MouseEvent): Unit = js.native
  
  var spawnLead: Double = js.native
  
  var `type`: N = js.native
  
  def update(): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object Shimmer {
  
  @scala.inline
  def apply[N /* <: String */, C /* <: js.Object */](
    die: () => Unit,
    forceObj: C,
    id: Double,
    init: () => Unit,
    l: HTMLElement,
    noCount: Boolean,
    pop: MouseEvent => Unit,
    spawnLead: Double,
    `type`: N,
    update: () => Unit,
    x: Double,
    y: Double
  ): Shimmer[N, C] = {
    val __obj = js.Dynamic.literal(die = js.Any.fromFunction0(die), forceObj = forceObj.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), l = l.asInstanceOf[js.Any], noCount = noCount.asInstanceOf[js.Any], pop = js.Any.fromFunction1(pop), spawnLead = spawnLead.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shimmer[N, C]]
  }
  
  @scala.inline
  implicit class ShimmerOps[Self <: Shimmer[_, _], N /* <: String */, C /* <: js.Object */] (val x: Self with (Shimmer[N, C])) extends AnyVal {
    
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
    def setDie(value: () => Unit): Self = this.set("die", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceObj(value: C): Self = this.set("forceObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setL(value: HTMLElement): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCount(value: Boolean): Self = this.set("noCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop(value: MouseEvent => Unit): Self = this.set("pop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpawnLead(value: Double): Self = this.set("spawnLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: N): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
