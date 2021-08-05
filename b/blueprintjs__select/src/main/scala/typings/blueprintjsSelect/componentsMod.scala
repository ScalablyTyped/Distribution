package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.Fill
import typings.blueprintjsSelect.anon.PartialISuggestPropsany
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.multiSelectMod.IMultiSelectProps
import typings.blueprintjsSelect.omnibarMod.IOmnibarProps
import typings.blueprintjsSelect.queryListMod.IQueryListProps
import typings.blueprintjsSelect.selectMod.ISelectProps
import typings.blueprintjsSelect.suggestMod.ISuggestProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/components", "MultiSelect")
  @js.native
  class MultiSelect[T] protected ()
    extends typings.blueprintjsSelect.multiSelectMod.MultiSelect[T] {
    def this(props: IMultiSelectProps[T]) = this()
    def this(props: IMultiSelectProps[T], context: js.Any) = this()
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
        /* props */ IMultiSelectProps[U], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[
        /* props */ IMultiSelectProps[U], 
        typings.blueprintjsSelect.multiSelectMod.MultiSelect[U]
      ]]
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Omnibar")
  @js.native
  class Omnibar[T] protected ()
    extends typings.blueprintjsSelect.omnibarMod.Omnibar[T] {
    def this(props: IOmnibarProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IOmnibarProps[T], context: js.Any) = this()
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
    
    inline def ofType[U](): Instantiable1[/* props */ IOmnibarProps[U], typings.blueprintjsSelect.omnibarMod.Omnibar[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ IOmnibarProps[U], typings.blueprintjsSelect.omnibarMod.Omnibar[U]]]
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
  @js.native
  class QueryList[T] protected ()
    extends typings.blueprintjsSelect.queryListMod.QueryList[T] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "QueryList.displayName")
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
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Select")
  @js.native
  class Select[T] protected ()
    extends typings.blueprintjsSelect.selectMod.Select[T] {
    def this(props: ISelectProps[T]) = this()
    def this(props: ISelectProps[T], context: js.Any) = this()
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
    
    inline def ofType[U](): Instantiable1[/* props */ ISelectProps[U], typings.blueprintjsSelect.selectMod.Select[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ISelectProps[U], typings.blueprintjsSelect.selectMod.Select[U]]]
  }
  
  @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
  @js.native
  class Suggest[T] protected ()
    extends typings.blueprintjsSelect.suggestMod.Suggest[T] {
    def this(props: ISuggestProps[T]) = this()
    def this(props: ISuggestProps[T], context: js.Any) = this()
  }
  /* static members */
  object Suggest {
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.defaultProps")
    @js.native
    def defaultProps: PartialISuggestPropsany = js.native
    inline def defaultProps_=(x: PartialISuggestPropsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components", "Suggest.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def ofType[U](): Instantiable1[/* props */ ISuggestProps[U], typings.blueprintjsSelect.suggestMod.Suggest[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ ISuggestProps[U], typings.blueprintjsSelect.suggestMod.Suggest[U]]]
  }
  
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
}
