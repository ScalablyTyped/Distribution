package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ContainerNode
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsMediaQueryListParser.anon.And
import typings.csstoolsMediaQueryListParser.anon.Media
import typings.csstoolsMediaQueryListParser.anon.NodeMediaQueryInvalidWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.NodeMediaQueryWithTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.NodeMediaQueryWithoutTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.anon.String
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesMediaQueryMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryInvalid")
  @js.native
  open class MediaQueryInvalid protected ()
    extends StObject
       with MediaQuery {
    def this(media: js.Array[ComponentValue]) = this()
    
    def isMediaQueryInvalid(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryInvalid */ Boolean = js.native
    
    var media: js.Array[ComponentValue] = js.native
    
    def negateQuery(): MediaQuery = js.native
    
    def toJSON(): String = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryInvalidWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryInvalidWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaQueryInvalid {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryInvalid")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaQueryInvalid(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryInvalid */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryInvalid")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryInvalid */ Boolean]
  }
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryWithType")
  @js.native
  open class MediaQueryWithType protected ()
    extends StObject
       with MediaQuery
       with _MediaQueryWithTypeWalkerParent {
    def this(modifier: js.Array[CSSToken], mediaType: js.Array[CSSToken]) = this()
    def this(modifier: js.Array[CSSToken], mediaType: js.Array[CSSToken], and: js.Array[CSSToken]) = this()
    def this(
      modifier: js.Array[CSSToken],
      mediaType: js.Array[CSSToken],
      and: js.Array[CSSToken],
      media: MediaCondition
    ) = this()
    def this(modifier: js.Array[CSSToken], mediaType: js.Array[CSSToken], and: Unit, media: MediaCondition) = this()
    
    var and: js.UndefOr[js.Array[CSSToken]] = js.native
    
    def at(index: java.lang.String): js.UndefOr[MediaCondition] = js.native
    def at(index: Double): js.UndefOr[MediaCondition] = js.native
    
    def getMediaType(): java.lang.String = js.native
    
    def getModifier(): java.lang.String = js.native
    
    def indexOf(item: MediaCondition): Double | java.lang.String = js.native
    
    def isMediaQueryWithType(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean = js.native
    
    var media: js.UndefOr[MediaCondition] = js.native
    
    var mediaType: js.Array[CSSToken] = js.native
    
    var modifier: js.Array[CSSToken] = js.native
    
    def negateQuery(): MediaQuery = js.native
    
    def toJSON(): And = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryWithTypeWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryWithTypeWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaQueryWithType {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryWithType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaQueryWithType(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryWithType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithType */ Boolean]
  }
  
  @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryWithoutType")
  @js.native
  open class MediaQueryWithoutType protected ()
    extends StObject
       with MediaQuery
       with _MediaQueryWithoutTypeWalkerParent {
    def this(media: MediaCondition) = this()
    
    def at(index: java.lang.String): js.UndefOr[MediaCondition] = js.native
    def at(index: Double): js.UndefOr[MediaCondition] = js.native
    
    def indexOf(item: MediaCondition): Double | java.lang.String = js.native
    
    def isMediaQueryWithoutType(): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithoutType */ Boolean = js.native
    
    var media: MediaCondition = js.native
    
    def negateQuery(): MediaQuery = js.native
    
    def toJSON(): Media = js.native
    
    def tokens(): js.Array[CSSToken] = js.native
    
    var `type`: NodeType = js.native
    
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryWithoutTypeWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ]
    ): js.UndefOr[`false`] = js.native
    def walk[T /* <: Record[java.lang.String, Any] */](
      cb: js.Function2[
          /* entry */ NodeMediaQueryWithoutTypeWalkerEntry[T], 
          /* index */ Double | java.lang.String, 
          Boolean | Unit
        ],
      state: T
    ): js.UndefOr[`false`] = js.native
  }
  /* static members */
  object MediaQueryWithoutType {
    
    @JSImport("@csstools/media-query-list-parser/dist/nodes/media-query", "MediaQueryWithoutType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMediaQueryWithoutType(x: Any): /* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithoutType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaQueryWithoutType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is @csstools/media-query-list-parser.@csstools/media-query-list-parser/dist/nodes/media-query.MediaQueryWithoutType */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType
    - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType
    - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalid
  */
  trait MediaQuery extends StObject
  
  type MediaQueryInvalidWalkerEntry = ComponentValue
  
  type MediaQueryInvalidWalkerParent = ComponentValue | MediaQueryInvalid
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
  */
  type MediaQueryWithTypeWalkerEntry = _MediaQueryWithTypeWalkerEntry | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithType
  */
  type MediaQueryWithTypeWalkerParent = _MediaQueryWithTypeWalkerParent | ContainerNode
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerEntry
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaCondition
  */
  type MediaQueryWithoutTypeWalkerEntry = _MediaQueryWithoutTypeWalkerEntry | ComponentValue
  
  /* Rewritten from type alias, can be one of: 
    - typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerParent
    - typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutType
  */
  type MediaQueryWithoutTypeWalkerParent = _MediaQueryWithoutTypeWalkerParent | ContainerNode
  
  trait _MediaQueryWithTypeWalkerEntry extends StObject
  
  trait _MediaQueryWithTypeWalkerParent extends StObject
  
  trait _MediaQueryWithoutTypeWalkerEntry extends StObject
  
  trait _MediaQueryWithoutTypeWalkerParent extends StObject
}
