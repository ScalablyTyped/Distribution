package typings.atBlueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.atBlueprintjsSelect.libEsmCommonListItemsUtilsMod.ICreateNewItem
import typings.atBlueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.IOmnibarProps
import typings.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod.IQueryListProps
import typings.atBlueprintjsSelect.libEsmComponentsSelectMultiSelectMod.IMultiSelectProps
import typings.atBlueprintjsSelect.libEsmComponentsSelectSelectMod.ISelectProps
import typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod.ISuggestProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components", JSImport.Namespace)
@js.native
object libEsmComponentsMod extends js.Object {
  @js.native
  class MultiSelect[T] ()
    extends typings.atBlueprintjsSelect.libEsmComponentsSelectMultiSelectMod.MultiSelect[T]
  
  @js.native
  class Omnibar[T] ()
    extends typings.atBlueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.Omnibar[T]
  
  @js.native
  class QueryList[T] protected ()
    extends typings.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  
  @js.native
  class Select[T] ()
    extends typings.atBlueprintjsSelect.libEsmComponentsSelectSelectMod.Select[T]
  
  @js.native
  class Suggest[T] ()
    extends typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod.Suggest[T]
  
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
    var defaultProps: Anon_Fill = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IMultiSelectProps[T], 
        typings.atBlueprintjsSelect.libEsmComponentsSelectMultiSelectMod.MultiSelect[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Omnibar extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IOmnibarProps[T], 
        typings.atBlueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.Omnibar[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object QueryList extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ IQueryListProps[T], 
        typings.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod.QueryList[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ ISelectProps[T], 
        typings.atBlueprintjsSelect.libEsmComponentsSelectSelectMod.Select[T]
      ] = js.native
  }
  
  /* static members */
  @js.native
  object Suggest extends js.Object {
    var defaultProps: Partial[ISuggestProps[_]] = js.native
    var displayName: String = js.native
    def ofType[T](): Instantiable1[
        /* props */ ISuggestProps[T], 
        typings.atBlueprintjsSelect.libEsmComponentsSelectSuggestMod.Suggest[T]
      ] = js.native
  }
  
}

