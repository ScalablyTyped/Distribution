package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var background: String = js.native
  var baseFontSize: Double = js.native
  var bgDark: String = js.native
  var bgLight: String = js.native
  var brandColor: String = js.native
  var checkerboardPatternDark: String = js.native
  var checkerboardPatternLight: String = js.native
  var codeColor: String = js.native
  var codeStyles: StringDictionary[StringDictionary[String]] = js.native
  var fontFamily: String = js.native
  var fontHeading: String = js.native
  var fontMono: String = js.native
  var lightColor: String = js.native
  var linkColor: String = js.native
  var msRatio: Double = js.native
  var navBarBackground: String = js.native
  var navBarTextColor: String = js.native
  var pageHeadingBackground: String = js.native
  var pageHeadingHeight: Double = js.native
  var pageHeadingTextColor: String = js.native
  var sidebarColor: String = js.native
  var sidebarColorActive: String = js.native
  var sidebarColorHeading: String = js.native
  var sidebarColorLine: String = js.native
  var sidebarColorText: String = js.native
  var sidebarColorTextActive: String = js.native
  var textColor: String = js.native
}

object Theme {
  @scala.inline
  def apply(
    background: String,
    baseFontSize: Double,
    bgDark: String,
    bgLight: String,
    brandColor: String,
    checkerboardPatternDark: String,
    checkerboardPatternLight: String,
    codeColor: String,
    codeStyles: StringDictionary[StringDictionary[String]],
    fontFamily: String,
    fontHeading: String,
    fontMono: String,
    lightColor: String,
    linkColor: String,
    msRatio: Double,
    navBarBackground: String,
    navBarTextColor: String,
    pageHeadingBackground: String,
    pageHeadingHeight: Double,
    pageHeadingTextColor: String,
    sidebarColor: String,
    sidebarColorActive: String,
    sidebarColorHeading: String,
    sidebarColorLine: String,
    sidebarColorText: String,
    sidebarColorTextActive: String,
    textColor: String
  ): Theme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], baseFontSize = baseFontSize.asInstanceOf[js.Any], bgDark = bgDark.asInstanceOf[js.Any], bgLight = bgLight.asInstanceOf[js.Any], brandColor = brandColor.asInstanceOf[js.Any], checkerboardPatternDark = checkerboardPatternDark.asInstanceOf[js.Any], checkerboardPatternLight = checkerboardPatternLight.asInstanceOf[js.Any], codeColor = codeColor.asInstanceOf[js.Any], codeStyles = codeStyles.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontHeading = fontHeading.asInstanceOf[js.Any], fontMono = fontMono.asInstanceOf[js.Any], lightColor = lightColor.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], msRatio = msRatio.asInstanceOf[js.Any], navBarBackground = navBarBackground.asInstanceOf[js.Any], navBarTextColor = navBarTextColor.asInstanceOf[js.Any], pageHeadingBackground = pageHeadingBackground.asInstanceOf[js.Any], pageHeadingHeight = pageHeadingHeight.asInstanceOf[js.Any], pageHeadingTextColor = pageHeadingTextColor.asInstanceOf[js.Any], sidebarColor = sidebarColor.asInstanceOf[js.Any], sidebarColorActive = sidebarColorActive.asInstanceOf[js.Any], sidebarColorHeading = sidebarColorHeading.asInstanceOf[js.Any], sidebarColorLine = sidebarColorLine.asInstanceOf[js.Any], sidebarColorText = sidebarColorText.asInstanceOf[js.Any], sidebarColorTextActive = sidebarColorTextActive.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setBaseFontSize(value: Double): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgDark(value: String): Self = this.set("bgDark", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgLight(value: String): Self = this.set("bgLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrandColor(value: String): Self = this.set("brandColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckerboardPatternDark(value: String): Self = this.set("checkerboardPatternDark", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckerboardPatternLight(value: String): Self = this.set("checkerboardPatternLight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeColor(value: String): Self = this.set("codeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeStyles(value: StringDictionary[StringDictionary[String]]): Self = this.set("codeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontHeading(value: String): Self = this.set("fontHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontMono(value: String): Self = this.set("fontMono", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightColor(value: String): Self = this.set("lightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkColor(value: String): Self = this.set("linkColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsRatio(value: Double): Self = this.set("msRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavBarBackground(value: String): Self = this.set("navBarBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavBarTextColor(value: String): Self = this.set("navBarTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeadingBackground(value: String): Self = this.set("pageHeadingBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeadingHeight(value: Double): Self = this.set("pageHeadingHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageHeadingTextColor(value: String): Self = this.set("pageHeadingTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColor(value: String): Self = this.set("sidebarColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColorActive(value: String): Self = this.set("sidebarColorActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColorHeading(value: String): Self = this.set("sidebarColorHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColorLine(value: String): Self = this.set("sidebarColorLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColorText(value: String): Self = this.set("sidebarColorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarColorTextActive(value: String): Self = this.set("sidebarColorTextActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
  }
  
}

