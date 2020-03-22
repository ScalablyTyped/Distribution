package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typings.blueprintjsSelect.omnibarMod.IOmnibarProps
import typings.blueprintjsSelect.queryListMod.IQueryListProps
import typings.blueprintjsSelect.selectMod.ISelectProps
import typings.blueprintjsSelect.suggestMod.ISuggestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  class MultiSelect[T] ()
    extends typings.blueprintjsSelect.multiSelectMod.MultiSelect[T]
  
  @js.native
  class Omnibar[T] ()
    extends typings.blueprintjsSelect.omnibarMod.Omnibar[T]
  
  @js.native
  class QueryList[T] protected ()
    extends typings.blueprintjsSelect.queryListMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  
  @js.native
  class Select[T] ()
    extends typings.blueprintjsSelect.selectMod.Select[T]
  
  @js.native
  class Suggest[T] ()
    extends typings.blueprintjsSelect.suggestMod.Suggest[T]
  
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String, direction: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = js.native
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = js.native
  /* static members */
  @js.native
  object MultiSelect extends js.Object {
    var defaultProps: AnonFill = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IMultiSelectProps[T], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ IOmnibarProps[T], typings.blueprintjsSelect.omnibarMod.Omnibar[T]] = js.native
  }
  
  /* static members */
  @js.native
  object QueryList extends js.Object {
    var defaultProps: AnonDisabled = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IQueryListProps[T], 
        typings.blueprintjsSelect.queryListMod.QueryList[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISelectProps[T], typings.blueprintjsSelect.selectMod.Select[T]] = js.native
  }
  
  /* static members */
  @js.native
  object Suggest extends js.Object {
    var defaultProps: PartialISuggestPropsany = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[/* props */ ISuggestProps[T], typings.blueprintjsSelect.suggestMod.Suggest[T]] = js.native
  }
  
}

