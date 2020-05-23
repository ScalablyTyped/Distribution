package typings.babelCore.mod

import typings.babelCore.anon.File
import typings.babelTypes.mod.File_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileResult extends js.Object {
  var ast: js.UndefOr[File_ | Null] = js.undefined
  var code: js.UndefOr[String | Null] = js.undefined
  var ignored: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[File | Null] = js.undefined
  var metadata: js.UndefOr[BabelFileMetadata] = js.undefined
}

object BabelFileResult {
  @scala.inline
  def apply(
    ast: js.UndefOr[Null | File_] = js.undefined,
    code: js.UndefOr[Null | String] = js.undefined,
    ignored: js.UndefOr[Boolean] = js.undefined,
    map: js.UndefOr[Null | File] = js.undefined,
    metadata: BabelFileMetadata = null
  ): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(ignored)) __obj.updateDynamic("ignored")(ignored.get.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelFileResult]
  }
}

