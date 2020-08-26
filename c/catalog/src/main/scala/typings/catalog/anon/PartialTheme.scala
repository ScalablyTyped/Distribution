package typings.catalog.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<catalog.catalog.Theme> */
@js.native
trait PartialTheme extends js.Object {
  var background: js.UndefOr[String] = js.native
  var baseFontSize: js.UndefOr[Double] = js.native
  var bgDark: js.UndefOr[String] = js.native
  var bgLight: js.UndefOr[String] = js.native
  var brandColor: js.UndefOr[String] = js.native
  var checkerboardPatternDark: js.UndefOr[String] = js.native
  var checkerboardPatternLight: js.UndefOr[String] = js.native
  var codeColor: js.UndefOr[String] = js.native
  var codeStyles: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontHeading: js.UndefOr[String] = js.native
  var fontMono: js.UndefOr[String] = js.native
  var lightColor: js.UndefOr[String] = js.native
  var linkColor: js.UndefOr[String] = js.native
  var msRatio: js.UndefOr[Double] = js.native
  var navBarBackground: js.UndefOr[String] = js.native
  var navBarTextColor: js.UndefOr[String] = js.native
  var pageHeadingBackground: js.UndefOr[String] = js.native
  var pageHeadingHeight: js.UndefOr[Double] = js.native
  var pageHeadingTextColor: js.UndefOr[String] = js.native
  var sidebarColor: js.UndefOr[String] = js.native
  var sidebarColorActive: js.UndefOr[String] = js.native
  var sidebarColorHeading: js.UndefOr[String] = js.native
  var sidebarColorLine: js.UndefOr[String] = js.native
  var sidebarColorText: js.UndefOr[String] = js.native
  var sidebarColorTextActive: js.UndefOr[String] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object PartialTheme {
  @scala.inline
  def apply(): PartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTheme]
  }
  @scala.inline
  implicit class PartialThemeOps[Self <: PartialTheme] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBaseFontSize(value: Double): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
    @scala.inline
    def setBgDark(value: String): Self = this.set("bgDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgDark: Self = this.set("bgDark", js.undefined)
    @scala.inline
    def setBgLight(value: String): Self = this.set("bgLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgLight: Self = this.set("bgLight", js.undefined)
    @scala.inline
    def setBrandColor(value: String): Self = this.set("brandColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandColor: Self = this.set("brandColor", js.undefined)
    @scala.inline
    def setCheckerboardPatternDark(value: String): Self = this.set("checkerboardPatternDark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckerboardPatternDark: Self = this.set("checkerboardPatternDark", js.undefined)
    @scala.inline
    def setCheckerboardPatternLight(value: String): Self = this.set("checkerboardPatternLight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckerboardPatternLight: Self = this.set("checkerboardPatternLight", js.undefined)
    @scala.inline
    def setCodeColor(value: String): Self = this.set("codeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeColor: Self = this.set("codeColor", js.undefined)
    @scala.inline
    def setCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = this.set("codeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodeStyles: Self = this.set("codeStyles", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontHeading(value: String): Self = this.set("fontHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontHeading: Self = this.set("fontHeading", js.undefined)
    @scala.inline
    def setFontMono(value: String): Self = this.set("fontMono", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontMono: Self = this.set("fontMono", js.undefined)
    @scala.inline
    def setLightColor(value: String): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightColor: Self = this.set("lightColor", js.undefined)
    @scala.inline
    def setLinkColor(value: String): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkColor: Self = this.set("linkColor", js.undefined)
    @scala.inline
    def setMsRatio(value: Double): Self = this.set("msRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsRatio: Self = this.set("msRatio", js.undefined)
    @scala.inline
    def setNavBarBackground(value: String): Self = this.set("navBarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavBarBackground: Self = this.set("navBarBackground", js.undefined)
    @scala.inline
    def setNavBarTextColor(value: String): Self = this.set("navBarTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavBarTextColor: Self = this.set("navBarTextColor", js.undefined)
    @scala.inline
    def setPageHeadingBackground(value: String): Self = this.set("pageHeadingBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeadingBackground: Self = this.set("pageHeadingBackground", js.undefined)
    @scala.inline
    def setPageHeadingHeight(value: Double): Self = this.set("pageHeadingHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeadingHeight: Self = this.set("pageHeadingHeight", js.undefined)
    @scala.inline
    def setPageHeadingTextColor(value: String): Self = this.set("pageHeadingTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageHeadingTextColor: Self = this.set("pageHeadingTextColor", js.undefined)
    @scala.inline
    def setSidebarColor(value: String): Self = this.set("sidebarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColor: Self = this.set("sidebarColor", js.undefined)
    @scala.inline
    def setSidebarColorActive(value: String): Self = this.set("sidebarColorActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColorActive: Self = this.set("sidebarColorActive", js.undefined)
    @scala.inline
    def setSidebarColorHeading(value: String): Self = this.set("sidebarColorHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColorHeading: Self = this.set("sidebarColorHeading", js.undefined)
    @scala.inline
    def setSidebarColorLine(value: String): Self = this.set("sidebarColorLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColorLine: Self = this.set("sidebarColorLine", js.undefined)
    @scala.inline
    def setSidebarColorText(value: String): Self = this.set("sidebarColorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColorText: Self = this.set("sidebarColorText", js.undefined)
    @scala.inline
    def setSidebarColorTextActive(value: String): Self = this.set("sidebarColorTextActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSidebarColorTextActive: Self = this.set("sidebarColorTextActive", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

