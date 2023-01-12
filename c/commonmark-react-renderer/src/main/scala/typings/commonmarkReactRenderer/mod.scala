package typings.commonmarkReactRenderer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.commonmark.mod.Node
import typings.commonmarkReactRenderer.anon.Children
import typings.commonmarkReactRenderer.anon.PartialRenderers
import typings.commonmarkReactRenderer.anon.Props
import typings.commonmarkReactRenderer.commonmarkReactRendererBooleans.`false`
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("commonmark-react-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ReactRenderer = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("commonmark-react-renderer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Renderer {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var allowedTypes: js.Array[String] = js.native
    
    /* CompleteClass */
    var escapeHtml: Boolean = js.native
    
    /* CompleteClass */
    var linkTarget: String | `false` = js.native
    
    /* CompleteClass */
    override def render(root: Node): ReactNode = js.native
    
    /* CompleteClass */
    var renderers: Renderers = js.native
    
    /* CompleteClass */
    var skipHtml: Boolean = js.native
    
    /* CompleteClass */
    var softBreak: String = js.native
    
    /* CompleteClass */
    var sourcePos: Boolean = js.native
    
    /* CompleteClass */
    var transformImageUri: (js.Function1[/* uri */ String, String]) | Null = js.native
    
    /* CompleteClass */
    var transformLinUri: (js.Function1[/* uri */ String, String]) | Null = js.native
    
    /* CompleteClass */
    var unwrapDisallowed: Boolean = js.native
  }
  
  trait CodeBlockProps
    extends StObject
       with CommonProps {
    
    var codeinfo: js.UndefOr[js.Array[String]] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object CodeBlockProps {
    
    inline def apply(children: ReactElement, nodeKey: String): CodeBlockProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[CodeBlockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeBlockProps] (val x: Self) extends AnyVal {
      
      inline def setCodeinfo(value: js.Array[String]): Self = StObject.set(x, "codeinfo", value.asInstanceOf[js.Any])
      
      inline def setCodeinfoUndefined: Self = StObject.set(x, "codeinfo", js.undefined)
      
      inline def setCodeinfoVarargs(value: String*): Self = StObject.set(x, "codeinfo", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  trait CodeProps
    extends StObject
       with CommonProps {
    
    var `inline`: Boolean
  }
  object CodeProps {
    
    inline def apply(children: ReactElement, `inline`: Boolean, nodeKey: String): CodeProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], literal = null)
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeProps] (val x: Self) extends AnyVal {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommonProps extends StObject {
    
    var children: ReactElement
    
    var `data-sourcepos`: js.UndefOr[String] = js.undefined
    
    var literal: String | Null
    
    var nodeKey: String
  }
  object CommonProps {
    
    inline def apply(children: ReactElement, nodeKey: String): CommonProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[CommonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def `setData-sourcepos`(value: String): Self = StObject.set(x, "data-sourcepos", value.asInstanceOf[js.Any])
      
      inline def `setData-sourceposUndefined`: Self = StObject.set(x, "data-sourcepos", js.undefined)
      
      inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralNull: Self = StObject.set(x, "literal", null)
      
      inline def setNodeKey(value: String): Self = StObject.set(x, "nodeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeadingProps
    extends StObject
       with CommonProps {
    
    var level: Double
  }
  object HeadingProps {
    
    inline def apply(children: ReactElement, level: Double, nodeKey: String): HeadingProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlInlineBlockProps
    extends StObject
       with CommonProps {
    
    var escapeHtml: Boolean
    
    var isBlock: Boolean
    
    var skipHtml: Boolean
  }
  object HtmlInlineBlockProps {
    
    inline def apply(children: ReactElement, escapeHtml: Boolean, isBlock: Boolean, nodeKey: String, skipHtml: Boolean): HtmlInlineBlockProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], escapeHtml = escapeHtml.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], skipHtml = skipHtml.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[HtmlInlineBlockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlInlineBlockProps] (val x: Self) extends AnyVal {
      
      inline def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
      
      inline def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
      
      inline def setSkipHtml(value: Boolean): Self = StObject.set(x, "skipHtml", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageProps
    extends StObject
       with CommonProps {
    
    var alt: String
    
    var src: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ImageProps {
    
    inline def apply(alt: String, children: ReactElement, nodeKey: String, src: String): ImageProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with CommonProps {
    
    var href: String
    
    var target: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object LinkProps {
    
    inline def apply(children: ReactElement, href: String, nodeKey: String): LinkProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ListProps
    extends StObject
       with CommonProps {
    
    var start: Double
    
    var tight: Boolean
    
    var `type`: String
  }
  object ListProps {
    
    inline def apply(children: ReactElement, nodeKey: String, start: Double, tight: Boolean, `type`: String): ListProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], literal = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProps] (val x: Self) extends AnyVal {
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var allowNode: js.UndefOr[js.Function1[/* node */ Children, Any]] = js.undefined
    
    var allowedTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var disallowedTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var escapeHtml: js.UndefOr[Boolean] = js.undefined
    
    var linkTarget: js.UndefOr[String] = js.undefined
    
    var renderers: js.UndefOr[PartialRenderers] = js.undefined
    
    var skipHtml: js.UndefOr[Boolean] = js.undefined
    
    var softBreak: js.UndefOr[String] = js.undefined
    
    var sourcePos: js.UndefOr[Boolean] = js.undefined
    
    var transformImageUri: js.UndefOr[(js.Function1[/* uri */ String, String]) | Null] = js.undefined
    
    var transformLinkUri: js.UndefOr[(js.Function1[/* uri */ String, String]) | Null] = js.undefined
    
    var unwrapDisallowed: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowNode(value: /* node */ Children => Any): Self = StObject.set(x, "allowNode", js.Any.fromFunction1(value))
      
      inline def setAllowNodeUndefined: Self = StObject.set(x, "allowNode", js.undefined)
      
      inline def setAllowedTypes(value: js.Array[String]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
      
      inline def setAllowedTypesVarargs(value: String*): Self = StObject.set(x, "allowedTypes", js.Array(value*))
      
      inline def setDisallowedTypes(value: js.Array[String]): Self = StObject.set(x, "disallowedTypes", value.asInstanceOf[js.Any])
      
      inline def setDisallowedTypesUndefined: Self = StObject.set(x, "disallowedTypes", js.undefined)
      
      inline def setDisallowedTypesVarargs(value: String*): Self = StObject.set(x, "disallowedTypes", js.Array(value*))
      
      inline def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
      
      inline def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
      
      inline def setLinkTarget(value: String): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
      
      inline def setLinkTargetUndefined: Self = StObject.set(x, "linkTarget", js.undefined)
      
      inline def setRenderers(value: PartialRenderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      inline def setSkipHtml(value: Boolean): Self = StObject.set(x, "skipHtml", value.asInstanceOf[js.Any])
      
      inline def setSkipHtmlUndefined: Self = StObject.set(x, "skipHtml", js.undefined)
      
      inline def setSoftBreak(value: String): Self = StObject.set(x, "softBreak", value.asInstanceOf[js.Any])
      
      inline def setSoftBreakUndefined: Self = StObject.set(x, "softBreak", js.undefined)
      
      inline def setSourcePos(value: Boolean): Self = StObject.set(x, "sourcePos", value.asInstanceOf[js.Any])
      
      inline def setSourcePosUndefined: Self = StObject.set(x, "sourcePos", js.undefined)
      
      inline def setTransformImageUri(value: /* uri */ String => String): Self = StObject.set(x, "transformImageUri", js.Any.fromFunction1(value))
      
      inline def setTransformImageUriNull: Self = StObject.set(x, "transformImageUri", null)
      
      inline def setTransformImageUriUndefined: Self = StObject.set(x, "transformImageUri", js.undefined)
      
      inline def setTransformLinkUri(value: /* uri */ String => String): Self = StObject.set(x, "transformLinkUri", js.Any.fromFunction1(value))
      
      inline def setTransformLinkUriNull: Self = StObject.set(x, "transformLinkUri", null)
      
      inline def setTransformLinkUriUndefined: Self = StObject.set(x, "transformLinkUri", js.undefined)
      
      inline def setUnwrapDisallowed(value: Boolean): Self = StObject.set(x, "unwrapDisallowed", value.asInstanceOf[js.Any])
      
      inline def setUnwrapDisallowedUndefined: Self = StObject.set(x, "unwrapDisallowed", js.undefined)
    }
  }
  
  @js.native
  trait ReactRenderer
    extends StObject
       with Instantiable0[Renderer]
       with Instantiable1[/* options */ Options, Renderer] {
    
    var renderers: Renderers = js.native
    
    var types: js.Array[String] = js.native
    
    def uriTransformer(uri: String): String = js.native
  }
  
  trait Renderer extends StObject {
    
    var allowNode: js.UndefOr[js.Function1[/* node */ Props, Any]] = js.undefined
    
    var allowedTypes: js.Array[String]
    
    var escapeHtml: Boolean
    
    var linkTarget: String | `false`
    
    def render(root: Node): ReactNode
    
    var renderers: Renderers
    
    var skipHtml: Boolean
    
    var softBreak: String
    
    var sourcePos: Boolean
    
    var transformImageUri: (js.Function1[/* uri */ String, String]) | Null
    
    var transformLinUri: (js.Function1[/* uri */ String, String]) | Null
    
    var unwrapDisallowed: Boolean
  }
  object Renderer {
    
    inline def apply(
      allowedTypes: js.Array[String],
      escapeHtml: Boolean,
      linkTarget: String | `false`,
      render: Node => ReactNode,
      renderers: Renderers,
      skipHtml: Boolean,
      softBreak: String,
      sourcePos: Boolean,
      unwrapDisallowed: Boolean
    ): Renderer = {
      val __obj = js.Dynamic.literal(allowedTypes = allowedTypes.asInstanceOf[js.Any], escapeHtml = escapeHtml.asInstanceOf[js.Any], linkTarget = linkTarget.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), renderers = renderers.asInstanceOf[js.Any], skipHtml = skipHtml.asInstanceOf[js.Any], softBreak = softBreak.asInstanceOf[js.Any], sourcePos = sourcePos.asInstanceOf[js.Any], unwrapDisallowed = unwrapDisallowed.asInstanceOf[js.Any], transformImageUri = null, transformLinUri = null)
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      inline def setAllowNode(value: /* node */ Props => Any): Self = StObject.set(x, "allowNode", js.Any.fromFunction1(value))
      
      inline def setAllowNodeUndefined: Self = StObject.set(x, "allowNode", js.undefined)
      
      inline def setAllowedTypes(value: js.Array[String]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedTypesVarargs(value: String*): Self = StObject.set(x, "allowedTypes", js.Array(value*))
      
      inline def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
      
      inline def setLinkTarget(value: String | `false`): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Node => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderers(value: Renderers): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      inline def setSkipHtml(value: Boolean): Self = StObject.set(x, "skipHtml", value.asInstanceOf[js.Any])
      
      inline def setSoftBreak(value: String): Self = StObject.set(x, "softBreak", value.asInstanceOf[js.Any])
      
      inline def setSourcePos(value: Boolean): Self = StObject.set(x, "sourcePos", value.asInstanceOf[js.Any])
      
      inline def setTransformImageUri(value: /* uri */ String => String): Self = StObject.set(x, "transformImageUri", js.Any.fromFunction1(value))
      
      inline def setTransformImageUriNull: Self = StObject.set(x, "transformImageUri", null)
      
      inline def setTransformLinUri(value: /* uri */ String => String): Self = StObject.set(x, "transformLinUri", js.Any.fromFunction1(value))
      
      inline def setTransformLinUriNull: Self = StObject.set(x, "transformLinUri", null)
      
      inline def setUnwrapDisallowed(value: Boolean): Self = StObject.set(x, "unwrapDisallowed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Renderers extends StObject {
    
    var Blockquote: String | ComponentType[CommonProps] | Null
    
    var Code: String | ComponentType[CodeProps] | Null
    
    var CodeBlock: String | ComponentType[CodeBlockProps] | Null
    
    var Emph: String | ComponentType[CommonProps] | Null
    
    var Heading: String | ComponentType[HeadingProps] | Null
    
    var HtmlBlock: String | ComponentType[HtmlInlineBlockProps] | Null
    
    var HtmlInline: String | ComponentType[HtmlInlineBlockProps] | Null
    
    var Image: String | ComponentType[ImageProps] | Null
    
    var Item: String | ComponentType[CommonProps] | Null
    
    var Linebreak: String | ComponentType[CommonProps] | Null
    
    var Link: String | ComponentType[LinkProps] | Null
    
    var List: String | ComponentType[ListProps] | Null
    
    var Paragraph: String | ComponentType[CommonProps] | Null
    
    var Softbreak: String | ComponentType[SoftBreakProps] | Null
    
    var Strong: String | ComponentType[CommonProps] | Null
    
    var Text: String | ComponentType[CommonProps] | Null
    
    var ThematicBreak: String | ComponentType[CommonProps] | Null
  }
  object Renderers {
    
    inline def apply(): Renderers = {
      val __obj = js.Dynamic.literal(Blockquote = null, Code = null, CodeBlock = null, Emph = null, Heading = null, HtmlBlock = null, HtmlInline = null, Image = null, Item = null, Linebreak = null, Link = null, List = null, Paragraph = null, Softbreak = null, Strong = null, Text = null, ThematicBreak = null)
      __obj.asInstanceOf[Renderers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderers] (val x: Self) extends AnyVal {
      
      inline def setBlockquote(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Blockquote", value.asInstanceOf[js.Any])
      
      inline def setBlockquoteNull: Self = StObject.set(x, "Blockquote", null)
      
      inline def setCode(value: String | ComponentType[CodeProps]): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
      
      inline def setCodeBlock(value: String | ComponentType[CodeBlockProps]): Self = StObject.set(x, "CodeBlock", value.asInstanceOf[js.Any])
      
      inline def setCodeBlockNull: Self = StObject.set(x, "CodeBlock", null)
      
      inline def setCodeNull: Self = StObject.set(x, "Code", null)
      
      inline def setEmph(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Emph", value.asInstanceOf[js.Any])
      
      inline def setEmphNull: Self = StObject.set(x, "Emph", null)
      
      inline def setHeading(value: String | ComponentType[HeadingProps]): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingNull: Self = StObject.set(x, "Heading", null)
      
      inline def setHtmlBlock(value: String | ComponentType[HtmlInlineBlockProps]): Self = StObject.set(x, "HtmlBlock", value.asInstanceOf[js.Any])
      
      inline def setHtmlBlockNull: Self = StObject.set(x, "HtmlBlock", null)
      
      inline def setHtmlInline(value: String | ComponentType[HtmlInlineBlockProps]): Self = StObject.set(x, "HtmlInline", value.asInstanceOf[js.Any])
      
      inline def setHtmlInlineNull: Self = StObject.set(x, "HtmlInline", null)
      
      inline def setImage(value: String | ComponentType[ImageProps]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "Image", null)
      
      inline def setItem(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "Item", null)
      
      inline def setLinebreak(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Linebreak", value.asInstanceOf[js.Any])
      
      inline def setLinebreakNull: Self = StObject.set(x, "Linebreak", null)
      
      inline def setLink(value: String | ComponentType[LinkProps]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
      
      inline def setLinkNull: Self = StObject.set(x, "Link", null)
      
      inline def setList(value: String | ComponentType[ListProps]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
      
      inline def setListNull: Self = StObject.set(x, "List", null)
      
      inline def setParagraph(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphNull: Self = StObject.set(x, "Paragraph", null)
      
      inline def setSoftbreak(value: String | ComponentType[SoftBreakProps]): Self = StObject.set(x, "Softbreak", value.asInstanceOf[js.Any])
      
      inline def setSoftbreakNull: Self = StObject.set(x, "Softbreak", null)
      
      inline def setStrong(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Strong", value.asInstanceOf[js.Any])
      
      inline def setStrongNull: Self = StObject.set(x, "Strong", null)
      
      inline def setText(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "Text", null)
      
      inline def setThematicBreak(value: String | ComponentType[CommonProps]): Self = StObject.set(x, "ThematicBreak", value.asInstanceOf[js.Any])
      
      inline def setThematicBreakNull: Self = StObject.set(x, "ThematicBreak", null)
    }
  }
  
  trait SoftBreakProps
    extends StObject
       with CommonProps {
    
    var softBreak: String
  }
  object SoftBreakProps {
    
    inline def apply(children: ReactElement, nodeKey: String, softBreak: String): SoftBreakProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], nodeKey = nodeKey.asInstanceOf[js.Any], softBreak = softBreak.asInstanceOf[js.Any], literal = null)
      __obj.asInstanceOf[SoftBreakProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SoftBreakProps] (val x: Self) extends AnyVal {
      
      inline def setSoftBreak(value: String): Self = StObject.set(x, "softBreak", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & ReactRenderer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ReactRenderer = ^
}
