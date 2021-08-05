package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialISuggestPropsany
import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typings.blueprintjsSelect.omnibarMod.IOmnibarProps
import typings.blueprintjsSelect.queryListMod.IQueryListProps
import typings.blueprintjsSelect.selectMod.ISelectProps
import typings.blueprintjsSelect.suggestMod.ISuggestProps
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
    
    @JSImport("@blueprintjs/select", "Classes.SELECT_POPOVER")
    @js.native
    val SELECT_POPOVER: String = js.native
  }
  
  @JSImport("@blueprintjs/select", "MultiSelect")
  @js.native
  class MultiSelect[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.MultiSelect[T] {
    def this(props: IMultiSelectProps[T]) = this()
    def this(props: IMultiSelectProps[T], context: js.Any) = this()
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
        /* props */ IMultiSelectProps[U], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ IMultiSelectProps[U], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Omnibar")
  @js.native
  class Omnibar[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.Omnibar[T] {
    def this(props: IOmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOmnibarProps[T], context: js.Any) = this()
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
    
    inline def ofType[U](): Instantiable1[/* props */ IOmnibarProps[U], typings.blueprintjsSelect.omnibarMod.Omnibar[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ IOmnibarProps[U], typings.blueprintjsSelect.omnibarMod.Omnibar[U]]]
  }
  
  @JSImport("@blueprintjs/select", "QueryList")
  @js.native
  class QueryList[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "QueryList.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "QueryList.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[
        /* props */ IQueryListProps[U], 
        typings.blueprintjsSelect.queryListMod.QueryList[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ IQueryListProps[U], 
        typings.blueprintjsSelect.queryListMod.QueryList[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select", "Select")
  @js.native
  class Select[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.Select[T] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
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
    
    inline def ofType[U](): Instantiable1[/* props */ ISelectProps[U], typings.blueprintjsSelect.selectMod.Select[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ISelectProps[U], typings.blueprintjsSelect.selectMod.Select[U]]]
  }
  
  @JSImport("@blueprintjs/select", "Suggest")
  @js.native
  class Suggest[T] protected ()
    extends typings.blueprintjsSelect.componentsMod.Suggest[T] {
    def this(props: ISuggestProps[T]) = this()
    def this(props: ISuggestProps[T], context: js.Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialISuggestPropsany = js.native
    inline def defaultProps_=(x: PartialISuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ ISuggestProps[U], typings.blueprintjsSelect.suggestMod.Suggest[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ISuggestProps[U], typings.blueprintjsSelect.suggestMod.Suggest[U]]]
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
  inline def getActiveItem[T](activeItem: ICreateNewItem): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveItem")(activeItem.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def getCreateNewItem(): ICreateNewItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreateNewItem")().asInstanceOf[ICreateNewItem]
  
  inline def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any]).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Unit, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Unit,
    startIndex: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  inline def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Unit, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  
  inline def isCreateNewItem[T](): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")().asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: T): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  inline def isCreateNewItem[T](item: ICreateNewItem): /* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreateNewItem")(item.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/select.@blueprintjs/select/lib/esm/common/listItemsUtils.ICreateNewItem */ Boolean]
  
  inline def renderFilteredItems(props: IItemListRendererProps[js.Any]): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: IItemListRendererProps[js.Any], noResults: Unit, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: IItemListRendererProps[js.Any], noResults: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  inline def renderFilteredItems(props: IItemListRendererProps[js.Any], noResults: ReactNode, initialContent: ReactNode): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFilteredItems")(props.asInstanceOf[js.Any], noResults.asInstanceOf[js.Any], initialContent.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
