package typings.atBabelCore.atBabelCoreMod

import typings.atBabelCore.Anon_File
import typings.atBabelTypes.atBabelTypesMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileResult extends js.Object {
  var ast: js.UndefOr[File | Null] = js.undefined
  var code: js.UndefOr[String | Null] = js.undefined
  var ignored: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Anon_File | Null] = js.undefined
  var metadata: js.UndefOr[BabelFileMetadata] = js.undefined
}

object BabelFileResult {
  @scala.inline
  def apply(
    ast: File = null,
    code: String = null,
    ignored: js.UndefOr[Boolean] = js.undefined,
    map: Anon_File = null,
    metadata: BabelFileMetadata = null
  ): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileResult]
  }
}

