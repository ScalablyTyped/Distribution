package typings.blueprintjsTable

import typings.blueprintjsTable.truncatedFormatMod.ITruncatedFormatState
import typings.blueprintjsTable.truncatedFormatMod.TruncatedFormatProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object truncatedFormat2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat2", "TruncatedFormat2")
  @js.native
  open class TruncatedFormat2 protected () extends PureComponent[TruncatedFormatProps, ITruncatedFormatState, Any] {
    def this(props: TruncatedFormatProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TruncatedFormatProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTruncatedFormat2(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTruncatedFormat2(): Unit = js.native
    
    /* private */ var contentDiv: Any = js.native
    
    /* private */ var handleContentDivRef: Any = js.native
    
    /* private */ var handlePopoverClose: Any = js.native
    
    /* private */ var handlePopoverOpen: Any = js.native
    
    /* private */ var renderPopover: Any = js.native
    
    /* private */ var setTruncationState: Any = js.native
    
    /* private */ var shouldShowPopover: Any = js.native
  }
  /* static members */
  object TruncatedFormat2 {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat2", "TruncatedFormat2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat2", "TruncatedFormat2.defaultProps")
    @js.native
    def defaultProps: TruncatedFormatProps = js.native
    inline def defaultProps_=(x: TruncatedFormatProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/formats/truncatedFormat2", "TruncatedFormat2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
