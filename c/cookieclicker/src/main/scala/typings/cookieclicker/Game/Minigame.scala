package typings.cookieclicker.Game

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Minigame extends js.Object {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.native
  
  var effs: js.UndefOr[Effects] = js.native
  
  def init(div: HTMLDivElement): Unit = js.native
  
  /**
    * Ran on load, never after
    */
  def launch(): Unit = js.native
  
  def load(save: String): Unit = js.native
  
  var logic: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The name of the minigame
    */
  var name: String = js.native
  
  var onLevel: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onResize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRuinTheFun: js.UndefOr[js.Function0[Unit]] = js.native
  
  var parent: GameObject = js.native
  
  /**
    * @returns The save string, can't contain `;` `|` or `,`, it's recommended to not use letters
    */
  def save(): String = js.native
}
object Minigame {
  
  @scala.inline
  def apply(
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
  implicit class MinigameOps[Self <: Minigame] (val x: Self) extends AnyVal {
    
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
    def setInit(value: HTMLDivElement => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLaunch(value: () => Unit): Self = this.set("launch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: String => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: GameObject): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => String): Self = this.set("save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    
    @scala.inline
    def setEffs(value: Effects): Self = this.set("effs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffs: Self = this.set("effs", js.undefined)
    
    @scala.inline
    def setLogic(value: () => Unit): Self = this.set("logic", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLogic: Self = this.set("logic", js.undefined)
    
    @scala.inline
    def setOnLevel(value: () => Unit): Self = this.set("onLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLevel: Self = this.set("onLevel", js.undefined)
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnRuinTheFun(value: () => Unit): Self = this.set("onRuinTheFun", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRuinTheFun: Self = this.set("onRuinTheFun", js.undefined)
  }
}
