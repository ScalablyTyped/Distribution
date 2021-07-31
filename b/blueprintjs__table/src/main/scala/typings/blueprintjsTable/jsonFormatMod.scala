package typings.blueprintjsTable

import typings.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonFormatMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/jsonFormat", "JSONFormat")
  @js.native
  class JSONFormat protected ()
    extends Component[IJSONFormatProps, js.Object, js.Any] {
    def this(props: IJSONFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IJSONFormatProps, context: js.Any) = this()
  }
  /* static members */
  object JSONFormat {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/jsonFormat", "JSONFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/jsonFormat", "JSONFormat.defaultProps")
    @js.native
    def defaultProps: IJSONFormatProps = js.native
    @scala.inline
    def defaultProps_=(x: IJSONFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/jsonFormat", "JSONFormat.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IJSONFormatProps
    extends StObject
       with ITruncatedFormatProps {
    
    @JSName("children")
    var children_IJSONFormatProps: js.UndefOr[js.Any] = js.undefined
    
    /**
      * By default, we omit stringifying native JavaScript strings since
      * `JSON.stringify` awkwardly adds double-quotes to the display value.
      * This behavior can be turned off by setting this boolean to `false`.
      * @default true
      */
    var omitQuotesOnStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optionally specify the stringify method. Default is `JSON.stringify`
      * with 2-space indentation.
      */
    var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.undefined
  }
  object IJSONFormatProps {
    
    @scala.inline
    def apply(): IJSONFormatProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJSONFormatProps]
    }
    
    @scala.inline
    implicit class IJSONFormatPropsMutableBuilder[Self <: IJSONFormatProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOmitQuotesOnStrings(value: Boolean): Self = StObject.set(x, "omitQuotesOnStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitQuotesOnStringsUndefined: Self = StObject.set(x, "omitQuotesOnStrings", js.undefined)
      
      @scala.inline
      def setStringify(value: /* obj */ js.Any => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
}
