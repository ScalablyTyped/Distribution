package typings.chromaJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accent extends js.Object {
  var Accent: js.Array[String] = js.native
  var Blues: js.Array[String] = js.native
  var BrBG: js.Array[String] = js.native
  var BuGn: js.Array[String] = js.native
  var BuPu: js.Array[String] = js.native
  var Dark2: js.Array[String] = js.native
  var GnBu: js.Array[String] = js.native
  var Greens: js.Array[String] = js.native
  var Greys: js.Array[String] = js.native
  var OrRd: js.Array[String] = js.native
  var Oranges: js.Array[String] = js.native
  var PRGn: js.Array[String] = js.native
  var Paired: js.Array[String] = js.native
  var Pastel1: js.Array[String] = js.native
  var Pastel2: js.Array[String] = js.native
  var PiYG: js.Array[String] = js.native
  var PuBu: js.Array[String] = js.native
  var PuBuGn: js.Array[String] = js.native
  var PuOr: js.Array[String] = js.native
  var PuRd: js.Array[String] = js.native
  var Purples: js.Array[String] = js.native
  var RdBu: js.Array[String] = js.native
  var RdGy: js.Array[String] = js.native
  var RdPu: js.Array[String] = js.native
  var RdYlBu: js.Array[String] = js.native
  var RdYlGn: js.Array[String] = js.native
  var Reds: js.Array[String] = js.native
  var Set1: js.Array[String] = js.native
  var Set2: js.Array[String] = js.native
  var Set3: js.Array[String] = js.native
  var Spectral: js.Array[String] = js.native
  var YlGn: js.Array[String] = js.native
  var YlGnBu: js.Array[String] = js.native
  var YlOrBr: js.Array[String] = js.native
  var YlOrRd: js.Array[String] = js.native
}

object Accent {
  @scala.inline
  def apply(
    Accent: js.Array[String],
    Blues: js.Array[String],
    BrBG: js.Array[String],
    BuGn: js.Array[String],
    BuPu: js.Array[String],
    Dark2: js.Array[String],
    GnBu: js.Array[String],
    Greens: js.Array[String],
    Greys: js.Array[String],
    OrRd: js.Array[String],
    Oranges: js.Array[String],
    PRGn: js.Array[String],
    Paired: js.Array[String],
    Pastel1: js.Array[String],
    Pastel2: js.Array[String],
    PiYG: js.Array[String],
    PuBu: js.Array[String],
    PuBuGn: js.Array[String],
    PuOr: js.Array[String],
    PuRd: js.Array[String],
    Purples: js.Array[String],
    RdBu: js.Array[String],
    RdGy: js.Array[String],
    RdPu: js.Array[String],
    RdYlBu: js.Array[String],
    RdYlGn: js.Array[String],
    Reds: js.Array[String],
    Set1: js.Array[String],
    Set2: js.Array[String],
    Set3: js.Array[String],
    Spectral: js.Array[String],
    YlGn: js.Array[String],
    YlGnBu: js.Array[String],
    YlOrBr: js.Array[String],
    YlOrRd: js.Array[String]
  ): Accent = {
    val __obj = js.Dynamic.literal(Accent = Accent.asInstanceOf[js.Any], Blues = Blues.asInstanceOf[js.Any], BrBG = BrBG.asInstanceOf[js.Any], BuGn = BuGn.asInstanceOf[js.Any], BuPu = BuPu.asInstanceOf[js.Any], Dark2 = Dark2.asInstanceOf[js.Any], GnBu = GnBu.asInstanceOf[js.Any], Greens = Greens.asInstanceOf[js.Any], Greys = Greys.asInstanceOf[js.Any], OrRd = OrRd.asInstanceOf[js.Any], Oranges = Oranges.asInstanceOf[js.Any], PRGn = PRGn.asInstanceOf[js.Any], Paired = Paired.asInstanceOf[js.Any], Pastel1 = Pastel1.asInstanceOf[js.Any], Pastel2 = Pastel2.asInstanceOf[js.Any], PiYG = PiYG.asInstanceOf[js.Any], PuBu = PuBu.asInstanceOf[js.Any], PuBuGn = PuBuGn.asInstanceOf[js.Any], PuOr = PuOr.asInstanceOf[js.Any], PuRd = PuRd.asInstanceOf[js.Any], Purples = Purples.asInstanceOf[js.Any], RdBu = RdBu.asInstanceOf[js.Any], RdGy = RdGy.asInstanceOf[js.Any], RdPu = RdPu.asInstanceOf[js.Any], RdYlBu = RdYlBu.asInstanceOf[js.Any], RdYlGn = RdYlGn.asInstanceOf[js.Any], Reds = Reds.asInstanceOf[js.Any], Set1 = Set1.asInstanceOf[js.Any], Set2 = Set2.asInstanceOf[js.Any], Set3 = Set3.asInstanceOf[js.Any], Spectral = Spectral.asInstanceOf[js.Any], YlGn = YlGn.asInstanceOf[js.Any], YlGnBu = YlGnBu.asInstanceOf[js.Any], YlOrBr = YlOrBr.asInstanceOf[js.Any], YlOrRd = YlOrRd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accent]
  }
  @scala.inline
  implicit class AccentOps[Self <: Accent] (val x: Self) extends AnyVal {
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
    def setAccentVarargs(value: String*): Self = this.set("Accent", js.Array(value :_*))
    @scala.inline
    def setAccent(value: js.Array[String]): Self = this.set("Accent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBluesVarargs(value: String*): Self = this.set("Blues", js.Array(value :_*))
    @scala.inline
    def setBlues(value: js.Array[String]): Self = this.set("Blues", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrBGVarargs(value: String*): Self = this.set("BrBG", js.Array(value :_*))
    @scala.inline
    def setBrBG(value: js.Array[String]): Self = this.set("BrBG", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuGnVarargs(value: String*): Self = this.set("BuGn", js.Array(value :_*))
    @scala.inline
    def setBuGn(value: js.Array[String]): Self = this.set("BuGn", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuPuVarargs(value: String*): Self = this.set("BuPu", js.Array(value :_*))
    @scala.inline
    def setBuPu(value: js.Array[String]): Self = this.set("BuPu", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark2Varargs(value: String*): Self = this.set("Dark2", js.Array(value :_*))
    @scala.inline
    def setDark2(value: js.Array[String]): Self = this.set("Dark2", value.asInstanceOf[js.Any])
    @scala.inline
    def setGnBuVarargs(value: String*): Self = this.set("GnBu", js.Array(value :_*))
    @scala.inline
    def setGnBu(value: js.Array[String]): Self = this.set("GnBu", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreensVarargs(value: String*): Self = this.set("Greens", js.Array(value :_*))
    @scala.inline
    def setGreens(value: js.Array[String]): Self = this.set("Greens", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreysVarargs(value: String*): Self = this.set("Greys", js.Array(value :_*))
    @scala.inline
    def setGreys(value: js.Array[String]): Self = this.set("Greys", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrRdVarargs(value: String*): Self = this.set("OrRd", js.Array(value :_*))
    @scala.inline
    def setOrRd(value: js.Array[String]): Self = this.set("OrRd", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrangesVarargs(value: String*): Self = this.set("Oranges", js.Array(value :_*))
    @scala.inline
    def setOranges(value: js.Array[String]): Self = this.set("Oranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPRGnVarargs(value: String*): Self = this.set("PRGn", js.Array(value :_*))
    @scala.inline
    def setPRGn(value: js.Array[String]): Self = this.set("PRGn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPairedVarargs(value: String*): Self = this.set("Paired", js.Array(value :_*))
    @scala.inline
    def setPaired(value: js.Array[String]): Self = this.set("Paired", value.asInstanceOf[js.Any])
    @scala.inline
    def setPastel1Varargs(value: String*): Self = this.set("Pastel1", js.Array(value :_*))
    @scala.inline
    def setPastel1(value: js.Array[String]): Self = this.set("Pastel1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPastel2Varargs(value: String*): Self = this.set("Pastel2", js.Array(value :_*))
    @scala.inline
    def setPastel2(value: js.Array[String]): Self = this.set("Pastel2", value.asInstanceOf[js.Any])
    @scala.inline
    def setPiYGVarargs(value: String*): Self = this.set("PiYG", js.Array(value :_*))
    @scala.inline
    def setPiYG(value: js.Array[String]): Self = this.set("PiYG", value.asInstanceOf[js.Any])
    @scala.inline
    def setPuBuVarargs(value: String*): Self = this.set("PuBu", js.Array(value :_*))
    @scala.inline
    def setPuBu(value: js.Array[String]): Self = this.set("PuBu", value.asInstanceOf[js.Any])
    @scala.inline
    def setPuBuGnVarargs(value: String*): Self = this.set("PuBuGn", js.Array(value :_*))
    @scala.inline
    def setPuBuGn(value: js.Array[String]): Self = this.set("PuBuGn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPuOrVarargs(value: String*): Self = this.set("PuOr", js.Array(value :_*))
    @scala.inline
    def setPuOr(value: js.Array[String]): Self = this.set("PuOr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPuRdVarargs(value: String*): Self = this.set("PuRd", js.Array(value :_*))
    @scala.inline
    def setPuRd(value: js.Array[String]): Self = this.set("PuRd", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurplesVarargs(value: String*): Self = this.set("Purples", js.Array(value :_*))
    @scala.inline
    def setPurples(value: js.Array[String]): Self = this.set("Purples", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdBuVarargs(value: String*): Self = this.set("RdBu", js.Array(value :_*))
    @scala.inline
    def setRdBu(value: js.Array[String]): Self = this.set("RdBu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdGyVarargs(value: String*): Self = this.set("RdGy", js.Array(value :_*))
    @scala.inline
    def setRdGy(value: js.Array[String]): Self = this.set("RdGy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdPuVarargs(value: String*): Self = this.set("RdPu", js.Array(value :_*))
    @scala.inline
    def setRdPu(value: js.Array[String]): Self = this.set("RdPu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdYlBuVarargs(value: String*): Self = this.set("RdYlBu", js.Array(value :_*))
    @scala.inline
    def setRdYlBu(value: js.Array[String]): Self = this.set("RdYlBu", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdYlGnVarargs(value: String*): Self = this.set("RdYlGn", js.Array(value :_*))
    @scala.inline
    def setRdYlGn(value: js.Array[String]): Self = this.set("RdYlGn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedsVarargs(value: String*): Self = this.set("Reds", js.Array(value :_*))
    @scala.inline
    def setReds(value: js.Array[String]): Self = this.set("Reds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet1Varargs(value: String*): Self = this.set("Set1", js.Array(value :_*))
    @scala.inline
    def setSet1(value: js.Array[String]): Self = this.set("Set1", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet2Varargs(value: String*): Self = this.set("Set2", js.Array(value :_*))
    @scala.inline
    def setSet2(value: js.Array[String]): Self = this.set("Set2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet3Varargs(value: String*): Self = this.set("Set3", js.Array(value :_*))
    @scala.inline
    def setSet3(value: js.Array[String]): Self = this.set("Set3", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpectralVarargs(value: String*): Self = this.set("Spectral", js.Array(value :_*))
    @scala.inline
    def setSpectral(value: js.Array[String]): Self = this.set("Spectral", value.asInstanceOf[js.Any])
    @scala.inline
    def setYlGnVarargs(value: String*): Self = this.set("YlGn", js.Array(value :_*))
    @scala.inline
    def setYlGn(value: js.Array[String]): Self = this.set("YlGn", value.asInstanceOf[js.Any])
    @scala.inline
    def setYlGnBuVarargs(value: String*): Self = this.set("YlGnBu", js.Array(value :_*))
    @scala.inline
    def setYlGnBu(value: js.Array[String]): Self = this.set("YlGnBu", value.asInstanceOf[js.Any])
    @scala.inline
    def setYlOrBrVarargs(value: String*): Self = this.set("YlOrBr", js.Array(value :_*))
    @scala.inline
    def setYlOrBr(value: js.Array[String]): Self = this.set("YlOrBr", value.asInstanceOf[js.Any])
    @scala.inline
    def setYlOrRdVarargs(value: String*): Self = this.set("YlOrRd", js.Array(value :_*))
    @scala.inline
    def setYlOrRd(value: js.Array[String]): Self = this.set("YlOrRd", value.asInstanceOf[js.Any])
  }
  
}

