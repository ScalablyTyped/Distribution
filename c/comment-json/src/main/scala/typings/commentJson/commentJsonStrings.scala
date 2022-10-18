package typings.commentJson

import typings.commentJson.mod.CommentPrefix
import typings.commentJson.mod._CommentDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentJsonStrings {
  
  @js.native
  sealed trait BlockComment extends StObject
  inline def BlockComment: BlockComment = "BlockComment".asInstanceOf[BlockComment]
  
  @js.native
  sealed trait LineComment extends StObject
  inline def LineComment: LineComment = "LineComment".asInstanceOf[LineComment]
  
  @js.native
  sealed trait after
    extends StObject
       with CommentPrefix
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait `after-all`
    extends StObject
       with _CommentDescriptor
  inline def `after-all`: `after-all` = "after-all".asInstanceOf[`after-all`]
  
  @js.native
  sealed trait `after-colon`
    extends StObject
       with CommentPrefix
  inline def `after-colon`: `after-colon` = "after-colon".asInstanceOf[`after-colon`]
  
  @js.native
  sealed trait `after-prop`
    extends StObject
       with CommentPrefix
  inline def `after-prop`: `after-prop` = "after-prop".asInstanceOf[`after-prop`]
  
  @js.native
  sealed trait `after-value`
    extends StObject
       with CommentPrefix
  inline def `after-value`: `after-value` = "after-value".asInstanceOf[`after-value`]
  
  @js.native
  sealed trait before
    extends StObject
       with CommentPrefix
       with _CommentDescriptor
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait `before-all`
    extends StObject
       with _CommentDescriptor
  inline def `before-all`: `before-all` = "before-all".asInstanceOf[`before-all`]
}
