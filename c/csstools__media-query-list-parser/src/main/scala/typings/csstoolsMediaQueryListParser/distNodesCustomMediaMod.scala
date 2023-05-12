package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.HasFalseKeyword
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQuery
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesCustomMediaMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/custom-media", "CustomMedia")
  @js.native
  open class CustomMedia protected () extends StObject {
    def this(name: js.Array[CSSToken]) = this()
    def this(name: js.Array[CSSToken], mediaQueryList: js.Array[MediaQuery]) = this()
    def this(
      name: js.Array[CSSToken],
      mediaQueryList: js.Array[MediaQuery],
      trueOrFalseKeyword: js.Array[CSSToken]
    ) = this()
    def this(name: js.Array[CSSToken], mediaQueryList: Null, trueOrFalseKeyword: js.Array[CSSToken]) = this()
    
    def getName(): String = js.native
    
    def getNameToken(): CSSToken | Null = js.native
    
    def hasFalseKeyword(): Boolean = js.native
    
    def hasMediaQueryList(): Boolean = js.native
    
    def hasTrueKeyword(): Boolean = js.native
    
    def isCustomMedia(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/custom-media.CustomMedia */ Boolean = js.native
    
    var mediaQueryList: js.Array[MediaQuery] | Null = js.native
    
    var name: js.Array[CSSToken] = js.native
    
    def toJSON(): HasFalseKeyword = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var trueOrFalseKeyword: js.Array[CSSToken] | Null = js.native
    
    var `type`: NodeType = js.native
  }
  /* static members */
  object CustomMedia {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/custom-media", "CustomMedia")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isCustomMedia(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/custom-media.CustomMedia */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomMedia")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/custom-media.CustomMedia */ Boolean]
  }
}
