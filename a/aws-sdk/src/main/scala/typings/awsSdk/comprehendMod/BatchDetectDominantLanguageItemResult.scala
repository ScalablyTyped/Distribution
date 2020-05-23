package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectDominantLanguageItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}

object BatchDetectDominantLanguageItemResult {
  @scala.inline
  def apply(Index: js.UndefOr[Integer] = js.undefined, Languages: ListOfDominantLanguages = null): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index.get.asInstanceOf[js.Any])
    if (Languages != null) __obj.updateDynamic("Languages")(Languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
}

