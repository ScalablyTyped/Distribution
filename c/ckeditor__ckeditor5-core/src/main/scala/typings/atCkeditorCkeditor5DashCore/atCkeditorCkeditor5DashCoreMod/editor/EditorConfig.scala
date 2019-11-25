package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.editor

import typings.atCkeditorCkeditor5DashCore.Anon_Items
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.AlignmentConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.AutosaveConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.CKFinderAdapterConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.CloudServicesConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.FontFamilyConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.FontSizeConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.HeadingConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.HighlightConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.ImageConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.MediaEmbedConfig
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.Plugin
import typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod.TypingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// core/editor/editorconfig
trait EditorConfig extends js.Object {
  var alignment: AlignmentConfig
  var autosave: AutosaveConfig
  var balloonToolbar: js.Array[String]
  var blockToolbar: js.Array[String]
  var ckfinder: CKFinderAdapterConfig
  var cloudServices: CloudServicesConfig
  var fontFamily: FontFamilyConfig
  var fontSize: FontSizeConfig
  var heading: HeadingConfig
  var highlight: HighlightConfig
  var image: ImageConfig
  var language: String
  var mediaEmbed: MediaEmbedConfig
  var plugins: js.Array[String | Plugin[Unit]]
  var removePlugins: js.Array[String]
  var toolbar: js.Array[String] | Anon_Items
  var typing: TypingConfig
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
    toolbar: js.Array[String] | Anon_Items,
    typing: TypingConfig
  ): EditorConfig = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autosave = autosave.asInstanceOf[js.Any], balloonToolbar = balloonToolbar.asInstanceOf[js.Any], blockToolbar = blockToolbar.asInstanceOf[js.Any], ckfinder = ckfinder.asInstanceOf[js.Any], cloudServices = cloudServices.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mediaEmbed = mediaEmbed.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], removePlugins = removePlugins.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorConfig]
  }
}

