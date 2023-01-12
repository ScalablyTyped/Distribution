package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minigame extends StObject {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var effs: js.UndefOr[Effects] = js.undefined
  
  def init(div: HTMLDivElement): Unit
  
  /**
    * Ran on load, never after
    */
  def launch(): Unit
  
  def load(save: String): Unit
  
  var logic: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The name of the minigame
    */
  var name: String
  
  var onLevel: js.UndefOr[js.Function1[/* level */ Double, Unit]] = js.undefined
  
  var onResize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRuinTheFun: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var parent: GameObject
  
  /**
    * @returns The save string, can't contain `;` `|` or `,`, it's recommended to not use letters
    */
  def save(): String
}
object Minigame {
  
  inline def apply(
    init: HTMLDivElement => Unit,
    launch: () => Unit,
    load: String => Unit,
    name: String,
    parent: GameObject,
    save: () => String
  ): Minigame = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), launch = js.Any.fromFunction0(launch), load = js.Any.fromFunction1(load), name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[Minigame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Minigame] (val x: Self) extends AnyVal {
    
    inline def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    inline def setEffs(value: Effects): Self = StObject.set(x, "effs", value.asInstanceOf[js.Any])
    
    inline def setEffsUndefined: Self = StObject.set(x, "effs", js.undefined)
    
    inline def setInit(value: HTMLDivElement => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setLaunch(value: () => Unit): Self = StObject.set(x, "launch", js.Any.fromFunction0(value))
    
    inline def setLoad(value: String => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setLogic(value: () => Unit): Self = StObject.set(x, "logic", js.Any.fromFunction0(value))
    
    inline def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnLevel(value: /* level */ Double => Unit): Self = StObject.set(x, "onLevel", js.Any.fromFunction1(value))
    
    inline def setOnLevelUndefined: Self = StObject.set(x, "onLevel", js.undefined)
    
    inline def setOnResize(value: () => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction0(value))
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    
    inline def setOnRuinTheFun(value: () => Unit): Self = StObject.set(x, "onRuinTheFun", js.Any.fromFunction0(value))
    
    inline def setOnRuinTheFunUndefined: Self = StObject.set(x, "onRuinTheFun", js.undefined)
    
    inline def setParent(value: GameObject): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSave(value: () => String): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
