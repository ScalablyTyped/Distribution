package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.ckeditorNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dtdDefinition extends /* outerTagName */ StringDictionary[StringDictionary[`1`]] {
  @JSName("$block")
  var $block: StringDictionary[`1`] = js.native
  @JSName("$blockLimit")
  var $blockLimit: StringDictionary[`1`] = js.native
  @JSName("$cdata")
  var $cdata: StringDictionary[`1`] = js.native
  @JSName("$editable")
  var $editable: StringDictionary[`1`] = js.native
  @JSName("$empty")
  var $empty: StringDictionary[`1`] = js.native
  @JSName("$inline")
  var $inline: StringDictionary[`1`] = js.native
  @JSName("$intermediate")
  var $intermediate: StringDictionary[`1`] = js.native
  @JSName("$list")
  var $list: StringDictionary[`1`] = js.native
  @JSName("$listItem")
  var $listItem: StringDictionary[`1`] = js.native
  @JSName("$nonBodyContent")
  var $nonBodyContent: StringDictionary[`1`] = js.native
  @JSName("$nonEditable")
  var $nonEditable: StringDictionary[`1`] = js.native
  @JSName("$object")
  var $object: StringDictionary[`1`] = js.native
  @JSName("$removeEmpty")
  var $removeEmpty: StringDictionary[`1`] = js.native
  @JSName("$tabIndex")
  var $tabIndex: StringDictionary[`1`] = js.native
  @JSName("$tableContent")
  var $tableContent: StringDictionary[`1`] = js.native
  @JSName("$transparent")
  var $transparent: StringDictionary[`1`] = js.native
}

object dtdDefinition {
  @scala.inline
  def apply(
    $block: StringDictionary[`1`],
    $blockLimit: StringDictionary[`1`],
    $cdata: StringDictionary[`1`],
    $editable: StringDictionary[`1`],
    $empty: StringDictionary[`1`],
    $inline: StringDictionary[`1`],
    $intermediate: StringDictionary[`1`],
    $list: StringDictionary[`1`],
    $listItem: StringDictionary[`1`],
    $nonBodyContent: StringDictionary[`1`],
    $nonEditable: StringDictionary[`1`],
    $object: StringDictionary[`1`],
    $removeEmpty: StringDictionary[`1`],
    $tabIndex: StringDictionary[`1`],
    $tableContent: StringDictionary[`1`],
    $transparent: StringDictionary[`1`]
  ): dtdDefinition = {
    val __obj = js.Dynamic.literal($block = $block.asInstanceOf[js.Any], $blockLimit = $blockLimit.asInstanceOf[js.Any], $cdata = $cdata.asInstanceOf[js.Any], $editable = $editable.asInstanceOf[js.Any], $empty = $empty.asInstanceOf[js.Any], $inline = $inline.asInstanceOf[js.Any], $intermediate = $intermediate.asInstanceOf[js.Any], $list = $list.asInstanceOf[js.Any], $listItem = $listItem.asInstanceOf[js.Any], $nonBodyContent = $nonBodyContent.asInstanceOf[js.Any], $nonEditable = $nonEditable.asInstanceOf[js.Any], $object = $object.asInstanceOf[js.Any], $removeEmpty = $removeEmpty.asInstanceOf[js.Any], $tabIndex = $tabIndex.asInstanceOf[js.Any], $tableContent = $tableContent.asInstanceOf[js.Any], $transparent = $transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[dtdDefinition]
  }
  @scala.inline
  implicit class dtdDefinitionOps[Self <: dtdDefinition] (val x: Self) extends AnyVal {
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
    def set$block(value: StringDictionary[`1`]): Self = this.set("$block", value.asInstanceOf[js.Any])
    @scala.inline
    def set$blockLimit(value: StringDictionary[`1`]): Self = this.set("$blockLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def set$cdata(value: StringDictionary[`1`]): Self = this.set("$cdata", value.asInstanceOf[js.Any])
    @scala.inline
    def set$editable(value: StringDictionary[`1`]): Self = this.set("$editable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$empty(value: StringDictionary[`1`]): Self = this.set("$empty", value.asInstanceOf[js.Any])
    @scala.inline
    def set$inline(value: StringDictionary[`1`]): Self = this.set("$inline", value.asInstanceOf[js.Any])
    @scala.inline
    def set$intermediate(value: StringDictionary[`1`]): Self = this.set("$intermediate", value.asInstanceOf[js.Any])
    @scala.inline
    def set$list(value: StringDictionary[`1`]): Self = this.set("$list", value.asInstanceOf[js.Any])
    @scala.inline
    def set$listItem(value: StringDictionary[`1`]): Self = this.set("$listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def set$nonBodyContent(value: StringDictionary[`1`]): Self = this.set("$nonBodyContent", value.asInstanceOf[js.Any])
    @scala.inline
    def set$nonEditable(value: StringDictionary[`1`]): Self = this.set("$nonEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$object(value: StringDictionary[`1`]): Self = this.set("$object", value.asInstanceOf[js.Any])
    @scala.inline
    def set$removeEmpty(value: StringDictionary[`1`]): Self = this.set("$removeEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def set$tabIndex(value: StringDictionary[`1`]): Self = this.set("$tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def set$tableContent(value: StringDictionary[`1`]): Self = this.set("$tableContent", value.asInstanceOf[js.Any])
    @scala.inline
    def set$transparent(value: StringDictionary[`1`]): Self = this.set("$transparent", value.asInstanceOf[js.Any])
  }
  
}

