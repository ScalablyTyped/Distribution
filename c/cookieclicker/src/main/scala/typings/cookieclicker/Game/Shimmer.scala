package typings.cookieclicker.Game

import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shimmer[N /* <: String */, C /* <: js.Object */] extends StObject {
  
  def die(): Unit
  
  var forceObj: C
  
  var id: Double
  
  def init(): Unit
  
  var l: HTMLElement
  
  var noCount: Boolean
  
  def pop(event: MouseEvent): Unit
  
  var spawnLead: Double
  
  var `type`: N
  
  def update(): Unit
  
  var x: Double
  
  var y: Double
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
  implicit class ShimmerMutableBuilder[Self <: Shimmer[?, ?], N /* <: String */, C /* <: js.Object */] (val x: Self & (Shimmer[N, C])) extends AnyVal {
    
    @scala.inline
    def setDie(value: () => Unit): Self = StObject.set(x, "die", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceObj(value: C): Self = StObject.set(x, "forceObj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setL(value: HTMLElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCount(value: Boolean): Self = StObject.set(x, "noCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop(value: MouseEvent => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpawnLead(value: Double): Self = StObject.set(x, "spawnLead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: N): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
