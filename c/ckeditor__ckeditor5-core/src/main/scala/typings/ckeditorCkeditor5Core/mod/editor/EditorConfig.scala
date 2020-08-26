package typings.ckeditorCkeditor5Core.mod.editor

import typings.ckeditorCkeditor5Core.anon.Items
import typings.ckeditorCkeditor5Core.mod.AlignmentConfig
import typings.ckeditorCkeditor5Core.mod.AutosaveConfig
import typings.ckeditorCkeditor5Core.mod.CKFinderAdapterConfig
import typings.ckeditorCkeditor5Core.mod.CloudServicesConfig
import typings.ckeditorCkeditor5Core.mod.FontFamilyConfig
import typings.ckeditorCkeditor5Core.mod.FontSizeConfig
import typings.ckeditorCkeditor5Core.mod.HeadingConfig
import typings.ckeditorCkeditor5Core.mod.HighlightConfig
import typings.ckeditorCkeditor5Core.mod.ImageConfig
import typings.ckeditorCkeditor5Core.mod.MediaEmbedConfig
import typings.ckeditorCkeditor5Core.mod.Plugin
import typings.ckeditorCkeditor5Core.mod.TypingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorconfig
@js.native
trait EditorConfig extends js.Object {
  var alignment: AlignmentConfig = js.native
  var autosave: AutosaveConfig = js.native
  var balloonToolbar: js.Array[String] = js.native
  var blockToolbar: js.Array[String] = js.native
  var ckfinder: CKFinderAdapterConfig = js.native
  var cloudServices: CloudServicesConfig = js.native
  var fontFamily: FontFamilyConfig = js.native
  var fontSize: FontSizeConfig = js.native
  var heading: HeadingConfig = js.native
  var highlight: HighlightConfig = js.native
  var image: ImageConfig = js.native
  var language: String = js.native
  var mediaEmbed: MediaEmbedConfig = js.native
  var plugins: js.Array[String | Plugin[Unit]] = js.native
  var removePlugins: js.Array[String] = js.native
  var toolbar: js.Array[String] | Items = js.native
  var typing: TypingConfig = js.native
}

object EditorConfig {
  @scala.inline
  def apply(
    alignment: AlignmentConfig,
    autosave: AutosaveConfig,
    balloonToolbar: js.Array[String],
    blockToolbar: js.Array[String],
    ckfinder: CKFinderAdapterConfig,
    cloudServices: CloudServicesConfig,
    fontFamily: FontFamilyConfig,
    fontSize: FontSizeConfig,
    heading: HeadingConfig,
    highlight: HighlightConfig,
    image: ImageConfig,
    language: String,
    mediaEmbed: MediaEmbedConfig,
    plugins: js.Array[String | Plugin[Unit]],
    removePlugins: js.Array[String],
    toolbar: js.Array[String] | Items,
    typing: TypingConfig
  ): EditorConfig = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], balloonToolbar = balloonToolbar.asInstanceOf[js.Any], blockToolbar = blockToolbar.asInstanceOf[js.Any], ckfinder = ckfinder.asInstanceOf[js.Any], cloudServices = cloudServices.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mediaEmbed = mediaEmbed.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], removePlugins = removePlugins.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorConfig]
  }
  @scala.inline
  implicit class EditorConfigOps[Self <: EditorConfig] (val x: Self) extends AnyVal {
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
    def setAlignment(value: AlignmentConfig): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutosave(value: AutosaveConfig): Self = this.set("autosave", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalloonToolbarVarargs(value: String*): Self = this.set("balloonToolbar", js.Array(value :_*))
    @scala.inline
    def setBalloonToolbar(value: js.Array[String]): Self = this.set("balloonToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockToolbarVarargs(value: String*): Self = this.set("blockToolbar", js.Array(value :_*))
    @scala.inline
    def setBlockToolbar(value: js.Array[String]): Self = this.set("blockToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCkfinder(value: CKFinderAdapterConfig): Self = this.set("ckfinder", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudServices(value: CloudServicesConfig): Self = this.set("cloudServices", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: FontFamilyConfig): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: FontSizeConfig): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading(value: HeadingConfig): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: HighlightConfig): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: ImageConfig): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaEmbed(value: MediaEmbedConfig): Self = this.set("mediaEmbed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluginsVarargs(value: (String | Plugin[Unit])*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String | Plugin[Unit]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemovePluginsVarargs(value: String*): Self = this.set("removePlugins", js.Array(value :_*))
    @scala.inline
    def setRemovePlugins(value: js.Array[String]): Self = this.set("removePlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarVarargs(value: String*): Self = this.set("toolbar", js.Array(value :_*))
    @scala.inline
    def setToolbar(value: js.Array[String] | Items): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTyping(value: TypingConfig): Self = this.set("typing", value.asInstanceOf[js.Any])
  }
  
}

