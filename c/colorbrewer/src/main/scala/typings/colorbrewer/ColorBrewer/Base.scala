package typings.colorbrewer.ColorBrewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends js.Object {
  
  var Accent: EightColorScheme = js.native
  
  var Blues: NineColorScheme = js.native
  
  var BrBG: ElevenColorScheme = js.native
  
  var BuGn: NineColorScheme = js.native
  
  var BuPu: NineColorScheme = js.native
  
  var Dark2: EightColorScheme = js.native
  
  var GnBu: NineColorScheme = js.native
  
  var Greens: NineColorScheme = js.native
  
  var Greys: NineColorScheme = js.native
  
  var OrRd: NineColorScheme = js.native
  
  var Oranges: NineColorScheme = js.native
  
  var PRGn: ElevenColorScheme = js.native
  
  var Paired: TwelveColorScheme = js.native
  
  var Pastel1: NineColorScheme = js.native
  
  var Pastel2: EightColorScheme = js.native
  
  var PiYG: ElevenColorScheme = js.native
  
  var PuBu: NineColorScheme = js.native
  
  var PuBuGn: NineColorScheme = js.native
  
  var PuOr: ElevenColorScheme = js.native
  
  var PuRd: NineColorScheme = js.native
  
  var Purples: NineColorScheme = js.native
  
  var RdBu: ElevenColorScheme = js.native
  
  var RdGy: ElevenColorScheme = js.native
  
  var RdPu: NineColorScheme = js.native
  
  var RdYlBu: ElevenColorScheme = js.native
  
  var RdYlGn: ElevenColorScheme = js.native
  
  var Reds: NineColorScheme = js.native
  
  var Set1: NineColorScheme = js.native
  
  var Set2: EightColorScheme = js.native
  
  var Set3: TwelveColorScheme = js.native
  
  var Spectral: ElevenColorScheme = js.native
  
  var YlGn: NineColorScheme = js.native
  
  var YlGnBu: NineColorScheme = js.native
  
  var YlOrBr: NineColorScheme = js.native
  
  var YlOrRd: NineColorScheme = js.native
}
object Base {
  
  @scala.inline
  def apply(
    Accent: EightColorScheme,
    Blues: NineColorScheme,
    BrBG: ElevenColorScheme,
    BuGn: NineColorScheme,
    BuPu: NineColorScheme,
    Dark2: EightColorScheme,
    GnBu: NineColorScheme,
    Greens: NineColorScheme,
    Greys: NineColorScheme,
    OrRd: NineColorScheme,
    Oranges: NineColorScheme,
    PRGn: ElevenColorScheme,
    Paired: TwelveColorScheme,
    Pastel1: NineColorScheme,
    Pastel2: EightColorScheme,
    PiYG: ElevenColorScheme,
    PuBu: NineColorScheme,
    PuBuGn: NineColorScheme,
    PuOr: ElevenColorScheme,
    PuRd: NineColorScheme,
    Purples: NineColorScheme,
    RdBu: ElevenColorScheme,
    RdGy: ElevenColorScheme,
    RdPu: NineColorScheme,
    RdYlBu: ElevenColorScheme,
    RdYlGn: ElevenColorScheme,
    Reds: NineColorScheme,
    Set1: NineColorScheme,
    Set2: EightColorScheme,
    Set3: TwelveColorScheme,
    Spectral: ElevenColorScheme,
    YlGn: NineColorScheme,
    YlGnBu: NineColorScheme,
    YlOrBr: NineColorScheme,
    YlOrRd: NineColorScheme
  ): Base = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Blues = Blues.asInstanceOf[js.Any], BrBG = BrBG.asInstanceOf[js.Any], BuGn = BuGn.asInstanceOf[js.Any], BuPu = BuPu.asInstanceOf[js.Any], Dark2 = Dark2.asInstanceOf[js.Any], GnBu = GnBu.asInstanceOf[js.Any], Greens = Greens.asInstanceOf[js.Any], Greys = Greys.asInstanceOf[js.Any], OrRd = OrRd.asInstanceOf[js.Any], Oranges = Oranges.asInstanceOf[js.Any], PRGn = PRGn.asInstanceOf[js.Any], Paired = Paired.asInstanceOf[js.Any], Pastel1 = Pastel1.asInstanceOf[js.Any], Pastel2 = Pastel2.asInstanceOf[js.Any], PiYG = PiYG.asInstanceOf[js.Any], PuBu = PuBu.asInstanceOf[js.Any], PuBuGn = PuBuGn.asInstanceOf[js.Any], PuOr = PuOr.asInstanceOf[js.Any], PuRd = PuRd.asInstanceOf[js.Any], Purples = Purples.asInstanceOf[js.Any], RdBu = RdBu.asInstanceOf[js.Any], RdGy = RdGy.asInstanceOf[js.Any], RdPu = RdPu.asInstanceOf[js.Any], RdYlBu = RdYlBu.asInstanceOf[js.Any], RdYlGn = RdYlGn.asInstanceOf[js.Any], Reds = Reds.asInstanceOf[js.Any], Set1 = Set1.asInstanceOf[js.Any], Set2 = Set2.asInstanceOf[js.Any], Set3 = Set3.asInstanceOf[js.Any], Spectral = Spectral.asInstanceOf[js.Any], YlGn = YlGn.asInstanceOf[js.Any], YlGnBu = YlGnBu.asInstanceOf[js.Any], YlOrBr = YlOrBr.asInstanceOf[js.Any], YlOrRd = YlOrRd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    
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
    def setAccent(value: EightColorScheme): Self = this.set("Accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlues(value: NineColorScheme): Self = this.set("Blues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrBG(value: ElevenColorScheme): Self = this.set("BrBG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuGn(value: NineColorScheme): Self = this.set("BuGn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuPu(value: NineColorScheme): Self = this.set("BuPu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDark2(value: EightColorScheme): Self = this.set("Dark2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGnBu(value: NineColorScheme): Self = this.set("GnBu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreens(value: NineColorScheme): Self = this.set("Greens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreys(value: NineColorScheme): Self = this.set("Greys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrRd(value: NineColorScheme): Self = this.set("OrRd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOranges(value: NineColorScheme): Self = this.set("Oranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPRGn(value: ElevenColorScheme): Self = this.set("PRGn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaired(value: TwelveColorScheme): Self = this.set("Paired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastel1(value: NineColorScheme): Self = this.set("Pastel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastel2(value: EightColorScheme): Self = this.set("Pastel2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPiYG(value: ElevenColorScheme): Self = this.set("PiYG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuBu(value: NineColorScheme): Self = this.set("PuBu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuBuGn(value: NineColorScheme): Self = this.set("PuBuGn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuOr(value: ElevenColorScheme): Self = this.set("PuOr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPuRd(value: NineColorScheme): Self = this.set("PuRd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurples(value: NineColorScheme): Self = this.set("Purples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdBu(value: ElevenColorScheme): Self = this.set("RdBu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdGy(value: ElevenColorScheme): Self = this.set("RdGy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdPu(value: NineColorScheme): Self = this.set("RdPu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdYlBu(value: ElevenColorScheme): Self = this.set("RdYlBu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdYlGn(value: ElevenColorScheme): Self = this.set("RdYlGn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReds(value: NineColorScheme): Self = this.set("Reds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet1(value: NineColorScheme): Self = this.set("Set1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet2(value: EightColorScheme): Self = this.set("Set2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet3(value: TwelveColorScheme): Self = this.set("Set3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpectral(value: ElevenColorScheme): Self = this.set("Spectral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYlGn(value: NineColorScheme): Self = this.set("YlGn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYlGnBu(value: NineColorScheme): Self = this.set("YlGnBu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYlOrBr(value: NineColorScheme): Self = this.set("YlOrBr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYlOrRd(value: NineColorScheme): Self = this.set("YlOrRd", value.asInstanceOf[js.Any])
  }
}
