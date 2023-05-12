package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialSuggest2Propsany
import typings.blueprintjsSelect.anon.PartialSuggestPropsany
import typings.blueprintjsSelect.anon.ResetOnQuery
import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelect2Mod.MultiSelect2Props
import typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.MultiSelectProps
import typings.blueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.OmnibarProps
import typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryListProps
import typings.blueprintjsSelect.libEsmComponentsSelectSelect2Mod.Select2Props
import typings.blueprintjsSelect.libEsmComponentsSelectSelectMod.SelectProps
import typings.blueprintjsSelect.libEsmComponentsSuggestSuggest2Mod.Suggest2Props
import typings.blueprintjsSelect.libEsmComponentsSuggestSuggestMod.SuggestProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect")
  @js.native
  open class MultiSelect[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelectMod.MultiSelect[T] {
    def this(props: MultiSelectProps[T]) = this()
    def this(props: MultiSelectProps[T], context: Any) = this()
  }
  /* static members */
  object MultiSelect {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect.defaultProps")
    @js.native
    def defaultProps: Fill = js.native
    inline def defaultProps_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect2")
  @js.native
  open class MultiSelect2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsMultiSelectMultiSelect2Mod.MultiSelect2[T] {
    def this(props: MultiSelect2Props[T]) = this()
    def this(props: MultiSelect2Props[T], context: Any) = this()
  }
  /* static members */
  object MultiSelect2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect2.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect2.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar")
  @js.native
  open class Omnibar[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsOmnibarOmnibarMod.Omnibar[T] {
    def this(props: OmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: OmnibarProps[T], context: Any) = this()
  }
  /* static members */
  object Omnibar {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
  @js.native
  open class QueryList[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsQueryListQueryListMod.QueryList[T] {
    def this(props: QueryListProps[T]) = this()
    def this(props: QueryListProps[T], context: Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.defaultProps")
    @js.native
    def defaultProps: ResetOnQuery = js.native
    inline def defaultProps_=(x: ResetOnQuery): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Select")
  @js.native
  open class Select[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsSelectSelectMod.Select[T] {
    def this(props: SelectProps[T]) = this()
    def this(props: SelectProps[T], context: Any) = this()
  }
  /* static members */
  object Select {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Select2")
  @js.native
  open class Select2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsSelectSelect2Mod.Select2[T] {
    def this(props: Select2Props[T]) = this()
    def this(props: Select2Props[T], context: Any) = this()
  }
  /* static members */
  object Select2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Select2.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
  @js.native
  open class Suggest[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsSuggestSuggestMod.Suggest[T] {
    def this(props: SuggestProps[T]) = this()
    def this(props: SuggestProps[T], context: Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialSuggestPropsany = js.native
    inline def defaultProps_=(x: PartialSuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Suggest2")
  @js.native
  open class Suggest2[T] protected ()
    extends typings.blueprintjsSelect.libEsmComponentsSuggestSuggest2Mod.Suggest2[T] {
    def this(props: Suggest2Props[T]) = this()
    def this(props: Suggest2Props[T], context: Any) = this()
  }
  /* static members */
  object Suggest2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest2.defaultProps")
    @js.native
    def defaultProps: PartialSuggest2Propsany = js.native
    inline def defaultProps_=(x: PartialSuggest2Propsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest2.displayName")
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
}
