package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefs extends js.Object {
  
  var altDraw: PseudoBoolean = js.native
  
  var animate: PseudoBoolean = js.native
  
  var askLumps: PseudoBoolean = js.native
  
  var autosave: PseudoBoolean = js.native
  
  var autoupdate: PseudoBoolean = js.native
  
  var cursors: PseudoBoolean = js.native
  
  var customGrandmas: PseudoBoolean = js.native
  
  var extraButtons: PseudoBoolean = js.native
  
  var fancy: PseudoBoolean = js.native
  
  var filters: PseudoBoolean = js.native
  
  var focus: PseudoBoolean = js.native
  
  var format: PseudoBoolean = js.native
  
  var milk: PseudoBoolean = js.native
  
  var monospace: PseudoBoolean = js.native
  
  var notifs: PseudoBoolean = js.native
  
  var numbers: PseudoBoolean = js.native
  
  var particles: PseudoBoolean = js.native
  
  var popups: PseudoBoolean = js.native
  
  var showBackupWarning: PseudoBoolean = js.native
  
  var timeout: PseudoBoolean = js.native
  
  var warn: PseudoBoolean = js.native
  
  var wobbly: PseudoBoolean = js.native
}
object Prefs {
  
  @scala.inline
  def apply(
    altDraw: PseudoBoolean,
    animate: PseudoBoolean,
    askLumps: PseudoBoolean,
    autosave: PseudoBoolean,
    autoupdate: PseudoBoolean,
    cursors: PseudoBoolean,
    customGrandmas: PseudoBoolean,
    extraButtons: PseudoBoolean,
    fancy: PseudoBoolean,
    filters: PseudoBoolean,
    focus: PseudoBoolean,
    format: PseudoBoolean,
    milk: PseudoBoolean,
    monospace: PseudoBoolean,
    notifs: PseudoBoolean,
    numbers: PseudoBoolean,
    particles: PseudoBoolean,
    popups: PseudoBoolean,
    showBackupWarning: PseudoBoolean,
    timeout: PseudoBoolean,
    warn: PseudoBoolean,
    wobbly: PseudoBoolean
  ): Prefs = {
    val __obj = js.Dynamic.literal(altDraw = altDraw.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], askLumps = askLumps.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], autoupdate = autoupdate.asInstanceOf[js.Any], cursors = cursors.asInstanceOf[js.Any], customGrandmas = customGrandmas.asInstanceOf[js.Any], extraButtons = extraButtons.asInstanceOf[js.Any], fancy = fancy.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], milk = milk.asInstanceOf[js.Any], monospace = monospace.asInstanceOf[js.Any], notifs = notifs.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], particles = particles.asInstanceOf[js.Any], popups = popups.asInstanceOf[js.Any], showBackupWarning = showBackupWarning.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any], wobbly = wobbly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefs]
  }
  
  @scala.inline
  implicit class PrefsOps[Self <: Prefs] (val x: Self) extends AnyVal {
    
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
    def setAltDraw(value: PseudoBoolean): Self = this.set("altDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimate(value: PseudoBoolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAskLumps(value: PseudoBoolean): Self = this.set("askLumps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosave(value: PseudoBoolean): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoupdate(value: PseudoBoolean): Self = this.set("autoupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursors(value: PseudoBoolean): Self = this.set("cursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomGrandmas(value: PseudoBoolean): Self = this.set("customGrandmas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraButtons(value: PseudoBoolean): Self = this.set("extraButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFancy(value: PseudoBoolean): Self = this.set("fancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: PseudoBoolean): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: PseudoBoolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: PseudoBoolean): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilk(value: PseudoBoolean): Self = this.set("milk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonospace(value: PseudoBoolean): Self = this.set("monospace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifs(value: PseudoBoolean): Self = this.set("notifs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumbers(value: PseudoBoolean): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticles(value: PseudoBoolean): Self = this.set("particles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopups(value: PseudoBoolean): Self = this.set("popups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBackupWarning(value: PseudoBoolean): Self = this.set("showBackupWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: PseudoBoolean): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: PseudoBoolean): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWobbly(value: PseudoBoolean): Self = this.set("wobbly", value.asInstanceOf[js.Any])
  }
}
