package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialSuggest2Propsany
import typings.blueprintjsSelect.anon.PartialSuggestPropsany
import typings.blueprintjsSelect.anon.ResetOnQuery
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelect2Mod.MultiSelect2Props
import typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.MultiSelectProps
import typings.blueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.OmnibarProps
import typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryListProps
import typings.blueprintjsSelect.libEsmComponentsSelectSelect2Mod.Select2Props
import typings.blueprintjsSelect.libEsmComponentsSelectSelectMod.SelectProps
import typings.blueprintjsSelect.libEsmComponentsSuggestSuggest2Mod.Suggest2Props
import typings.blueprintjsSelect.libEsmComponentsSuggestSuggestMod.SuggestProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@blueprintjs/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Classes {
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT")
    @js.native
    val MULTISELECT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT_POPOVER")
    @js.native
    val MULTISELECT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.MULTISELECT_TAG_INPUT_INPUT")
    @js.native
    val MULTISELECT_TAG_INPUT_INPUT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.OMNIBAR")
    @js.native
    val OMNIBAR: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.OMNIBAR_OVERLAY")
    @js.native
    val OMNIBAR_OVERLAY: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SELECT")
    @js.native
    val SELECT: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SELECT_MATCH_TARGET_WIDTH")
    @js.native
    val SELECT_MATCH_TARGET_WIDTH: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SELECT_POPOVER")
    @js.native
    val SELECT_POPOVER: String = js.native
    
    @JSImport("@blueprintjs/select", "Classes.SUGGEST_POPOVER")
    @js.native
    val SUGGEST_POPOVER: String = js.native
  }
  
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  open class MultiSelect[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.MultiSelect[T] {
    def this(props: MultiSelectProps[T]) = this()
    def this(props: MultiSelectProps[T], context: Any) = this()
  }
  /* static members */
  object MultiSelect {
    
    @JSImport("@blueprintjs/select", "MultiSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "MultiSelect.defaultProps")
    @js.native
    def defaultProps: Fill = js.native
    inline def defaultProps_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "MultiSelect.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[
        /* props */ MultiSelectProps[U], 
        typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.MultiSelect[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ MultiSelectProps[U], 
        typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.MultiSelect[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "MultiSelect2")
  @js.native
  open class MultiSelect2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.MultiSelect2[T] {
    def this(props: MultiSelect2Props[T]) = this()
    def this(props: MultiSelect2Props[T], context: Any) = this()
  }
  /* static members */
  object MultiSelect2 {
    
    @JSImport("@blueprintjs/select", "MultiSelect2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "MultiSelect2.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "MultiSelect2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[
        /* props */ MultiSelect2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelect2Mod.MultiSelect2[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ MultiSelect2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelect2Mod.MultiSelect2[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Omnibar")
  @js.native
  open class Omnibar[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.Omnibar[T] {
    def this(props: OmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OmnibarProps[T], context: Any) = this()
  }
  /* static members */
  object Omnibar {
    
    @JSImport("@blueprintjs/select", "Omnibar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Omnibar.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[
        /* props */ OmnibarProps[U], 
        typings.blueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.Omnibar[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ OmnibarProps[U], 
        typings.blueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.Omnibar[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "QueryList")
  @js.native
  open class QueryList[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.QueryList[T] {
    def this(props: QueryListProps[T]) = this()
    def this(props: QueryListProps[T], context: Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "QueryList.defaultProps")
    @js.native
    def defaultProps: ResetOnQuery = js.native
    inline def defaultProps_=(x: ResetOnQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "QueryList.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[
        /* props */ QueryListProps[U], 
        typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryList[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ QueryListProps[U], 
        typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryList[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Select")
  @js.native
  open class Select[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.Select[T] {
    def this(props: SelectProps[T]) = this()
    def this(props: SelectProps[T], context: Any) = this()
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Select.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[
        /* props */ SelectProps[U], 
        typings.blueprintjsSelect.libEsmComponentsSelectSelectMod.Select[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ SelectProps[U], 
        typings.blueprintjsSelect.libEsmComponentsSelectSelectMod.Select[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Select2")
  @js.native
  open class Select2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.Select2[T] {
    def this(props: Select2Props[T]) = this()
    def this(props: Select2Props[T], context: Any) = this()
  }
  /* static members */
  object Select2 {
    
    @JSImport("@blueprintjs/select", "Select2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Select2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[
        /* props */ Select2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsSelectSelect2Mod.Select2[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ Select2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsSelectSelect2Mod.Select2[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Suggest")
  @js.native
  open class Suggest[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.Suggest[T] {
    def this(props: SuggestProps[T]) = this()
    def this(props: SuggestProps[T], context: Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialSuggestPropsany = js.native
    inline def defaultProps_=(x: PartialSuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[
        /* props */ SuggestProps[U], 
        typings.blueprintjsSelect.libEsmComponentsSuggestSuggestMod.Suggest[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ SuggestProps[U], 
        typings.blueprintjsSelect.libEsmComponentsSuggestSuggestMod.Suggest[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Suggest2")
  @js.native
  open class Suggest2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMod.Suggest2[T] {
    def this(props: Suggest2Props[T]) = this()
    def this(props: Suggest2Props[T], context: Any) = this()
  }
  /* static members */
  object Suggest2 {
    
    @JSImport("@blueprintjs/select", "Suggest2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Suggest2.defaultProps")
    @js.native
    def defaultProps: PartialSuggest2Propsany = js.native
    inline def defaultProps_=(x: PartialSuggest2Propsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Suggest2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[
        /* props */ Suggest2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsSuggestSuggest2Mod.Suggest2[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ Suggest2Props[U], 
        typings.blueprintjsSelect.libEsmComponentsSuggestSuggest2Mod.Suggest2[U]
      ]]
  }
  
  inline def executeItemsEqual[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")().asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: Unit, itemA: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: Unit, itemA: T, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: Unit, itemA: Null, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: Unit, itemA: Unit, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: T, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: Null, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def executeItemsEqual[T](itemsEqualProp: ItemsEqualProp[T], itemA: Unit, itemB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("executeItemsEqual")(itemsEqualProp.asInstanceOf[js.Any], itemA.asInstanceOf[js.Any], itemB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getActiveItem[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")().asInstanceOf[T | Null]
  inline def getActiveItem[T](activeItem: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def getActiveItem[T](activeItem: CreateNewItem): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def getCreateNewItem(): CreateNewItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateNewItem")().asInstanceOf[CreateNewItem]
  
  inline def getFirstEnabledItem[T](items: js.Array[T]): T | CreateNewItem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any]).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Unit, startIndex: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Unit,
    startIndex: Double
  ): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double, startIndex: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Unit, startIndex: Double): T | CreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | CreateNewItem | Null]
  
  inline def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")().asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: CreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.CreateNewItem */ Boolean]
  
  inline def renderFilteredItems(props: ItemListRendererProps[Any]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: Unit, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: ItemListRendererProps[Any], noResults: ReactNode, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
