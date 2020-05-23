package typings.codemirror.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowHintOptions extends js.Object {
  var alignWithWord: js.UndefOr[Boolean] = js.undefined
  var closeCharacters: js.UndefOr[RegExp] = js.undefined
  var closeOnUnfocus: js.UndefOr[Boolean] = js.undefined
  var completeOnSingleClick: js.UndefOr[Boolean] = js.undefined
  var completeSingle: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
  var customKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.undefined
  var extraKeys: js.UndefOr[
    (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String]) | Null
  ] = js.undefined
  var hint: HintFunction | AsyncHintFunction
}

object ShowHintOptions {
  @scala.inline
  def apply(
    hint: HintFunction | AsyncHintFunction,
    alignWithWord: js.UndefOr[Boolean] = js.undefined,
    closeCharacters: RegExp = null,
    closeOnUnfocus: js.UndefOr[Boolean] = js.undefined,
    completeOnSingleClick: js.UndefOr[Boolean] = js.undefined,
    completeSingle: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[Null | HTMLElement] = js.undefined,
    customKeys: js.UndefOr[
      Null | (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String])
    ] = js.undefined,
    extraKeys: js.UndefOr[
      Null | (StringDictionary[(js.Function2[/* editor */ Editor, /* handle */ Handle, Unit]) | String])
    ] = js.undefined
  ): ShowHintOptions = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any])
    if (!js.isUndefined(alignWithWord)) __obj.updateDynamic("alignWithWord")(alignWithWord.get.asInstanceOf[js.Any])
    if (closeCharacters != null) __obj.updateDynamic("closeCharacters")(closeCharacters.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnUnfocus)) __obj.updateDynamic("closeOnUnfocus")(closeOnUnfocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(completeOnSingleClick)) __obj.updateDynamic("completeOnSingleClick")(completeOnSingleClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(completeSingle)) __obj.updateDynamic("completeSingle")(completeSingle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(customKeys)) __obj.updateDynamic("customKeys")(customKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(extraKeys)) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHintOptions]
  }
}

