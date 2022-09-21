package typings.regexpTreeSaQo4gle

import typings.regexpTreeSaQo4gle.anon.AsNodes
import typings.regexpTreeSaQo4gle.anon.Format
import typings.regexpTreeSaQo4gle.anon.`0`
import typings.regexpTreeSaQo4gle.astMod.Alternative
import typings.regexpTreeSaQo4gle.astMod.Assertion
import typings.regexpTreeSaQo4gle.astMod.AstNode
import typings.regexpTreeSaQo4gle.astMod.AstRegExp
import typings.regexpTreeSaQo4gle.astMod.Backreference
import typings.regexpTreeSaQo4gle.astMod.Char
import typings.regexpTreeSaQo4gle.astMod.CharacterClass
import typings.regexpTreeSaQo4gle.astMod.ClassRange
import typings.regexpTreeSaQo4gle.astMod.Disjunction
import typings.regexpTreeSaQo4gle.astMod.Group
import typings.regexpTreeSaQo4gle.astMod.Quantifier
import typings.regexpTreeSaQo4gle.astMod.Repetition
import typings.std.Partial
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regexp-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regexp-tree", "TransformResult")
  @js.native
  open class TransformResult[T /* <: AstNode */, E] protected () extends StObject {
    def this(ast: T) = this()
    def this(ast: T, extra: E) = this()
    
    /* private */ var _ast: Any = js.native
    
    /* private */ var _extra: Any = js.native
    
    /* private */ var _regexp: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _string: Any = js.native
    
    def getAST(): T = js.native
    
    def getExtra(): E = js.native
    
    def getFlags(): String = js.native
    
    def getSource(): String = js.native
    
    def setExtra(extra: E): Unit = js.native
    
    def toRegExp(): js.RegExp = js.native
  }
  
  inline def compatTranspile(regexp: String): TransformResult[AstRegExp, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(regexp.asInstanceOf[js.Any]).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def compatTranspile(regexp: String, whitelist: js.Array[String]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(regexp.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def compatTranspile(regexp: js.RegExp): TransformResult[AstRegExp, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(regexp.asInstanceOf[js.Any]).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def compatTranspile(regexp: js.RegExp, whitelist: js.Array[String]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(regexp.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def compatTranspile[T /* <: AstNode */](ast: T): TransformResult[T, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(ast.asInstanceOf[js.Any]).asInstanceOf[TransformResult[T, Any]]
  inline def compatTranspile[T /* <: AstNode */](ast: T, whitelist: js.Array[String]): TransformResult[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compatTranspile")(ast.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T, Any]]
  
  inline def exec(re: String, string: String): RegExpExecArray = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(re.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[RegExpExecArray]
  inline def exec(re: js.RegExp, string: String): RegExpExecArray = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(re.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[RegExpExecArray]
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(ast: AstNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def optimize(regexp: String): TransformResult[AstRegExp, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(regexp.asInstanceOf[js.Any]).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def optimize(regexp: String, whitelist: js.Array[String]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(regexp.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def optimize(regexp: js.RegExp): TransformResult[AstRegExp, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(regexp.asInstanceOf[js.Any]).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def optimize(regexp: js.RegExp, whitelist: js.Array[String]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(regexp.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def optimize[T /* <: AstNode */](ast: T): TransformResult[T, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(ast.asInstanceOf[js.Any]).asInstanceOf[TransformResult[T, Any]]
  inline def optimize[T /* <: AstNode */](ast: T, whitelist: js.Array[String]): TransformResult[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(ast.asInstanceOf[js.Any], whitelist.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T, Any]]
  
  inline def parse(regexp: String): AstRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(regexp.asInstanceOf[js.Any]).asInstanceOf[AstRegExp]
  inline def parse(regexp: String, options: ParserOptions): AstRegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(regexp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AstRegExp]
  inline def parse(regexp: js.RegExp): AstRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(regexp.asInstanceOf[js.Any]).asInstanceOf[AstRegExp]
  inline def parse(regexp: js.RegExp, options: ParserOptions): AstRegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(regexp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AstRegExp]
  
  inline def toRegExp(regexp: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("toRegExp")(regexp.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  inline def transform(regexp: String, handlers: js.Array[TransformHandlers[AstRegExp]]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(regexp.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def transform(regexp: String, handlers: TransformHandlers[AstRegExp]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(regexp.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def transform(regexp: js.RegExp, handlers: js.Array[TransformHandlers[AstRegExp]]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(regexp.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def transform(regexp: js.RegExp, handlers: TransformHandlers[AstRegExp]): TransformResult[AstRegExp, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(regexp.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[AstRegExp, Any]]
  inline def transform[T /* <: AstNode */](ast: T, handlers: js.Array[TraversalHandlers[T]]): TransformResult[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T, Any]]
  inline def transform[T /* <: AstNode */](ast: T, handlers: TraversalHandlers[T]): TransformResult[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[TransformResult[T, Any]]
  
  inline def traverse[T /* <: AstNode */](ast: T, handlers: js.Array[TraversalHandlers[T]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverse[T /* <: AstNode */](ast: T, handlers: js.Array[NodeTraversalHandlers[T]], options: AsNodes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverse[T /* <: AstNode */](ast: T, handlers: js.Array[TraversalHandlers[T]], options: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverse[T /* <: AstNode */](ast: T, handlers: NodeTraversalHandlers[T], options: AsNodes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverse[T /* <: AstNode */](ast: T, handlers: TraversalHandlers[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def traverse[T /* <: AstNode */](ast: T, handlers: TraversalHandlers[T], options: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(ast.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait NodePath[T /* <: AstNode */] extends StObject {
    
    def appendChild[T /* <: AstNode */](): NodePath[T] | Null = js.native
    def appendChild[T /* <: AstNode */](node: T): NodePath[T] | Null = js.native
    def appendChild[T /* <: AstNode */](node: T, property: String): NodePath[T] | Null = js.native
    def appendChild[T /* <: AstNode */](node: Null, property: String): NodePath[T] | Null = js.native
    
    def getChild(): NodePath[AstNode] | Null = js.native
    def getChild(n: Double): NodePath[AstNode] | Null = js.native
    
    def getNextSibling(): NodePath[AstNode] | Null = js.native
    
    def getParent(): NodePath[AstNode] | Null = js.native
    
    def getPreviousSibling(): NodePath[AstNode] | Null = js.native
    
    def hasEqualSource(path: NodePath[T]): Boolean = js.native
    
    var index: Double | Null = js.native
    
    def insertChildAt[T /* <: AstNode */](node: T, index: Double): Unit = js.native
    def insertChildAt[T /* <: AstNode */](node: T, index: Double, property: String): Unit = js.native
    def insertChildAt[T /* <: AstNode */](node: Null, index: Double): Unit = js.native
    def insertChildAt[T /* <: AstNode */](node: Null, index: Double, property: String): Unit = js.native
    
    def isRemoved(): Boolean = js.native
    
    def jsonEncode(): String = js.native
    def jsonEncode(options: Format): String = js.native
    
    var node: T = js.native
    
    var parent: AstNode | Null = js.native
    
    var parentPath: NodePath[AstNode] | Null = js.native
    
    var property: String | Null = js.native
    
    def remove(): Unit = js.native
    
    def replace[T /* <: AstNode */](node: T): NodePath[T] | Null = js.native
    
    def setChild[T /* <: AstNode */](): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: T): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: T, index: Double): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: T, index: Double, property: String): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: T, index: Null, property: String): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: T, index: Unit, property: String): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: Null, index: Double): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: Null, index: Double, property: String): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: Null, index: Null, property: String): NodePath[T] | Null = js.native
    def setChild[T /* <: AstNode */](node: Null, index: Unit, property: String): NodePath[T] | Null = js.native
    
    def update(nodeProps: Partial[T]): Unit = js.native
  }
  
  type NodeTraversalCallback[T /* <: AstNode */] = js.Function4[
    /* node */ T, 
    /* parent */ NodePath[AstNode] | Null, 
    /* property */ js.UndefOr[String], 
    /* index */ js.UndefOr[Double], 
    Unit | Boolean
  ]
  
  trait NodeTraversalCallbacks[T /* <: AstNode */] extends StObject {
    
    var post: js.UndefOr[NodeTraversalCallback[T]] = js.undefined
    
    var pre: js.UndefOr[NodeTraversalCallback[T]] = js.undefined
  }
  object NodeTraversalCallbacks {
    
    inline def apply[T /* <: AstNode */](): NodeTraversalCallbacks[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeTraversalCallbacks[T]]
    }
    
    extension [Self <: NodeTraversalCallbacks[?], T /* <: AstNode */](x: Self & NodeTraversalCallbacks[T]) {
      
      inline def setPost(
        value: (T, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "post", js.Any.fromFunction4(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(
        value: (T, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "pre", js.Any.fromFunction4(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  trait NodeTraversalHandlers[T /* <: AstNode */]
    extends StObject
       with SpecificNodeTraversalHandlers {
    
    @JSName("*")
    var Asterisk: js.UndefOr[NodeTraversalCallback[AstNode]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* ast */ T, Unit]] = js.undefined
    
    var shouldRun: js.UndefOr[js.Function1[/* ast */ T, Boolean]] = js.undefined
  }
  object NodeTraversalHandlers {
    
    inline def apply[T /* <: AstNode */](): NodeTraversalHandlers[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeTraversalHandlers[T]]
    }
    
    extension [Self <: NodeTraversalHandlers[?], T /* <: AstNode */](x: Self & NodeTraversalHandlers[T]) {
      
      inline def setAsterisk(
        value: (AstNode, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "*", js.Any.fromFunction4(value))
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setInit(value: /* ast */ T => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setShouldRun(value: /* ast */ T => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
      
      inline def setShouldRunUndefined: Self = StObject.set(x, "shouldRun", js.undefined)
    }
  }
  
  trait ParserOptions extends StObject {
    
    var allowGroupNameDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var captureLocations: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    inline def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    extension [Self <: ParserOptions](x: Self) {
      
      inline def setAllowGroupNameDuplicates(value: Boolean): Self = StObject.set(x, "allowGroupNameDuplicates", value.asInstanceOf[js.Any])
      
      inline def setAllowGroupNameDuplicatesUndefined: Self = StObject.set(x, "allowGroupNameDuplicates", js.undefined)
      
      inline def setCaptureLocations(value: Boolean): Self = StObject.set(x, "captureLocations", value.asInstanceOf[js.Any])
      
      inline def setCaptureLocationsUndefined: Self = StObject.set(x, "captureLocations", js.undefined)
    }
  }
  
  /* Inlined {[ P in .regexp-tree-SaQo4gle.regexp-tree/ast.AstClass ]:? .regexp-tree-SaQo4gle.regexp-tree.NodeTraversalCallback<.regexp-tree-SaQo4gle.regexp-tree/ast.AstClassMap[P]> | .regexp-tree-SaQo4gle.regexp-tree.NodeTraversalCallbacks<.regexp-tree-SaQo4gle.regexp-tree/ast.AstClassMap[P]>} */
  trait SpecificNodeTraversalHandlers extends StObject {
    
    var Alternative: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Alternative] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Alternative]
      ] = js.undefined
    
    var Assertion: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Assertion] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Assertion]
      ] = js.undefined
    
    var Backreference: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Backreference] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Backreference]
      ] = js.undefined
    
    var Char: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Char] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Char]
      ] = js.undefined
    
    var CharacterClass: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.CharacterClass] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.CharacterClass]
      ] = js.undefined
    
    var ClassRange: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.ClassRange] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.ClassRange]
      ] = js.undefined
    
    var Disjunction: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Disjunction] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Disjunction]
      ] = js.undefined
    
    var Group: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Group] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Group]
      ] = js.undefined
    
    var Quantifier: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Quantifier] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Quantifier]
      ] = js.undefined
    
    var RegExp: js.UndefOr[NodeTraversalCallback[AstRegExp] | NodeTraversalCallbacks[AstRegExp]] = js.undefined
    
    var Repetition: js.UndefOr[
        NodeTraversalCallback[typings.regexpTreeSaQo4gle.astMod.Repetition] | NodeTraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Repetition]
      ] = js.undefined
  }
  object SpecificNodeTraversalHandlers {
    
    inline def apply(): SpecificNodeTraversalHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificNodeTraversalHandlers]
    }
    
    extension [Self <: SpecificNodeTraversalHandlers](x: Self) {
      
      inline def setAlternative(value: NodeTraversalCallback[Alternative] | NodeTraversalCallbacks[Alternative]): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeFunction4(
        value: (Alternative, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Alternative", js.Any.fromFunction4(value))
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "Alternative", js.undefined)
      
      inline def setAssertion(value: NodeTraversalCallback[Assertion] | NodeTraversalCallbacks[Assertion]): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionFunction4(
        value: (Assertion, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Assertion", js.Any.fromFunction4(value))
      
      inline def setAssertionUndefined: Self = StObject.set(x, "Assertion", js.undefined)
      
      inline def setBackreference(value: NodeTraversalCallback[Backreference] | NodeTraversalCallbacks[Backreference]): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setBackreferenceFunction4(
        value: (Backreference, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Backreference", js.Any.fromFunction4(value))
      
      inline def setBackreferenceUndefined: Self = StObject.set(x, "Backreference", js.undefined)
      
      inline def setChar(value: NodeTraversalCallback[Char] | NodeTraversalCallbacks[Char]): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharFunction4(
        value: (Char, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Char", js.Any.fromFunction4(value))
      
      inline def setCharUndefined: Self = StObject.set(x, "Char", js.undefined)
      
      inline def setCharacterClass(value: NodeTraversalCallback[CharacterClass] | NodeTraversalCallbacks[CharacterClass]): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setCharacterClassFunction4(
        value: (CharacterClass, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "CharacterClass", js.Any.fromFunction4(value))
      
      inline def setCharacterClassUndefined: Self = StObject.set(x, "CharacterClass", js.undefined)
      
      inline def setClassRange(value: NodeTraversalCallback[ClassRange] | NodeTraversalCallbacks[ClassRange]): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setClassRangeFunction4(
        value: (ClassRange, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "ClassRange", js.Any.fromFunction4(value))
      
      inline def setClassRangeUndefined: Self = StObject.set(x, "ClassRange", js.undefined)
      
      inline def setDisjunction(value: NodeTraversalCallback[Disjunction] | NodeTraversalCallbacks[Disjunction]): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setDisjunctionFunction4(
        value: (Disjunction, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Disjunction", js.Any.fromFunction4(value))
      
      inline def setDisjunctionUndefined: Self = StObject.set(x, "Disjunction", js.undefined)
      
      inline def setGroup(value: NodeTraversalCallback[Group] | NodeTraversalCallbacks[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupFunction4(
        value: (Group, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Group", js.Any.fromFunction4(value))
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setQuantifier(value: NodeTraversalCallback[Quantifier] | NodeTraversalCallbacks[Quantifier]): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierFunction4(
        value: (Quantifier, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Quantifier", js.Any.fromFunction4(value))
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "Quantifier", js.undefined)
      
      inline def setRegExp(value: NodeTraversalCallback[AstRegExp] | NodeTraversalCallbacks[AstRegExp]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpFunction4(
        value: (AstRegExp, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "RegExp", js.Any.fromFunction4(value))
      
      inline def setRegExpUndefined: Self = StObject.set(x, "RegExp", js.undefined)
      
      inline def setRepetition(value: NodeTraversalCallback[Repetition] | NodeTraversalCallbacks[Repetition]): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
      
      inline def setRepetitionFunction4(
        value: (Repetition, /* parent */ NodePath[AstNode] | Null, /* property */ js.UndefOr[String], /* index */ js.UndefOr[Double]) => Unit | Boolean
      ): Self = StObject.set(x, "Repetition", js.Any.fromFunction4(value))
      
      inline def setRepetitionUndefined: Self = StObject.set(x, "Repetition", js.undefined)
    }
  }
  
  /* Inlined {[ P in .regexp-tree-SaQo4gle.regexp-tree/ast.AstClass ]:? .regexp-tree-SaQo4gle.regexp-tree.TraversalCallback<.regexp-tree-SaQo4gle.regexp-tree/ast.AstClassMap[P]> | .regexp-tree-SaQo4gle.regexp-tree.TraversalCallbacks<.regexp-tree-SaQo4gle.regexp-tree/ast.AstClassMap[P]>} */
  trait SpecificTraversalHandlers extends StObject {
    
    var Alternative: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Alternative] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Alternative]
      ] = js.undefined
    
    var Assertion: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Assertion] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Assertion]
      ] = js.undefined
    
    var Backreference: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Backreference] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Backreference]
      ] = js.undefined
    
    var Char: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Char] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Char]
      ] = js.undefined
    
    var CharacterClass: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.CharacterClass] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.CharacterClass]
      ] = js.undefined
    
    var ClassRange: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.ClassRange] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.ClassRange]
      ] = js.undefined
    
    var Disjunction: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Disjunction] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Disjunction]
      ] = js.undefined
    
    var Group: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Group] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Group]
      ] = js.undefined
    
    var Quantifier: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Quantifier] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Quantifier]
      ] = js.undefined
    
    var RegExp: js.UndefOr[TraversalCallback[AstRegExp] | TraversalCallbacks[AstRegExp]] = js.undefined
    
    var Repetition: js.UndefOr[
        TraversalCallback[typings.regexpTreeSaQo4gle.astMod.Repetition] | TraversalCallbacks[typings.regexpTreeSaQo4gle.astMod.Repetition]
      ] = js.undefined
  }
  object SpecificTraversalHandlers {
    
    inline def apply(): SpecificTraversalHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificTraversalHandlers]
    }
    
    extension [Self <: SpecificTraversalHandlers](x: Self) {
      
      inline def setAlternative(value: TraversalCallback[Alternative] | TraversalCallbacks[Alternative]): Self = StObject.set(x, "Alternative", value.asInstanceOf[js.Any])
      
      inline def setAlternativeFunction1(value: /* path */ NodePath[Alternative] => Unit | Boolean): Self = StObject.set(x, "Alternative", js.Any.fromFunction1(value))
      
      inline def setAlternativeUndefined: Self = StObject.set(x, "Alternative", js.undefined)
      
      inline def setAssertion(value: TraversalCallback[Assertion] | TraversalCallbacks[Assertion]): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
      
      inline def setAssertionFunction1(value: /* path */ NodePath[Assertion] => Unit | Boolean): Self = StObject.set(x, "Assertion", js.Any.fromFunction1(value))
      
      inline def setAssertionUndefined: Self = StObject.set(x, "Assertion", js.undefined)
      
      inline def setBackreference(value: TraversalCallback[Backreference] | TraversalCallbacks[Backreference]): Self = StObject.set(x, "Backreference", value.asInstanceOf[js.Any])
      
      inline def setBackreferenceFunction1(value: /* path */ NodePath[Backreference] => Unit | Boolean): Self = StObject.set(x, "Backreference", js.Any.fromFunction1(value))
      
      inline def setBackreferenceUndefined: Self = StObject.set(x, "Backreference", js.undefined)
      
      inline def setChar(value: TraversalCallback[Char] | TraversalCallbacks[Char]): Self = StObject.set(x, "Char", value.asInstanceOf[js.Any])
      
      inline def setCharFunction1(value: /* path */ NodePath[Char] => Unit | Boolean): Self = StObject.set(x, "Char", js.Any.fromFunction1(value))
      
      inline def setCharUndefined: Self = StObject.set(x, "Char", js.undefined)
      
      inline def setCharacterClass(value: TraversalCallback[CharacterClass] | TraversalCallbacks[CharacterClass]): Self = StObject.set(x, "CharacterClass", value.asInstanceOf[js.Any])
      
      inline def setCharacterClassFunction1(value: /* path */ NodePath[CharacterClass] => Unit | Boolean): Self = StObject.set(x, "CharacterClass", js.Any.fromFunction1(value))
      
      inline def setCharacterClassUndefined: Self = StObject.set(x, "CharacterClass", js.undefined)
      
      inline def setClassRange(value: TraversalCallback[ClassRange] | TraversalCallbacks[ClassRange]): Self = StObject.set(x, "ClassRange", value.asInstanceOf[js.Any])
      
      inline def setClassRangeFunction1(value: /* path */ NodePath[ClassRange] => Unit | Boolean): Self = StObject.set(x, "ClassRange", js.Any.fromFunction1(value))
      
      inline def setClassRangeUndefined: Self = StObject.set(x, "ClassRange", js.undefined)
      
      inline def setDisjunction(value: TraversalCallback[Disjunction] | TraversalCallbacks[Disjunction]): Self = StObject.set(x, "Disjunction", value.asInstanceOf[js.Any])
      
      inline def setDisjunctionFunction1(value: /* path */ NodePath[Disjunction] => Unit | Boolean): Self = StObject.set(x, "Disjunction", js.Any.fromFunction1(value))
      
      inline def setDisjunctionUndefined: Self = StObject.set(x, "Disjunction", js.undefined)
      
      inline def setGroup(value: TraversalCallback[Group] | TraversalCallbacks[Group]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
      
      inline def setGroupFunction1(value: /* path */ NodePath[Group] => Unit | Boolean): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
      
      inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
      
      inline def setQuantifier(value: TraversalCallback[Quantifier] | TraversalCallbacks[Quantifier]): Self = StObject.set(x, "Quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierFunction1(value: /* path */ NodePath[Quantifier] => Unit | Boolean): Self = StObject.set(x, "Quantifier", js.Any.fromFunction1(value))
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "Quantifier", js.undefined)
      
      inline def setRegExp(value: TraversalCallback[AstRegExp] | TraversalCallbacks[AstRegExp]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpFunction1(value: /* path */ NodePath[AstRegExp] => Unit | Boolean): Self = StObject.set(x, "RegExp", js.Any.fromFunction1(value))
      
      inline def setRegExpUndefined: Self = StObject.set(x, "RegExp", js.undefined)
      
      inline def setRepetition(value: TraversalCallback[Repetition] | TraversalCallbacks[Repetition]): Self = StObject.set(x, "Repetition", value.asInstanceOf[js.Any])
      
      inline def setRepetitionFunction1(value: /* path */ NodePath[Repetition] => Unit | Boolean): Self = StObject.set(x, "Repetition", js.Any.fromFunction1(value))
      
      inline def setRepetitionUndefined: Self = StObject.set(x, "Repetition", js.undefined)
    }
  }
  
  type TransformHandlers[T /* <: AstNode */] = TraversalHandlers[T]
  
  type TraversalCallback[T /* <: AstNode */] = js.Function1[/* path */ NodePath[T], Unit | Boolean]
  
  trait TraversalCallbacks[T /* <: AstNode */] extends StObject {
    
    var post: js.UndefOr[TraversalCallback[T]] = js.undefined
    
    var pre: js.UndefOr[TraversalCallback[T]] = js.undefined
  }
  object TraversalCallbacks {
    
    inline def apply[T /* <: AstNode */](): TraversalCallbacks[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalCallbacks[T]]
    }
    
    extension [Self <: TraversalCallbacks[?], T /* <: AstNode */](x: Self & TraversalCallbacks[T]) {
      
      inline def setPost(value: /* path */ NodePath[T] => Unit | Boolean): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: /* path */ NodePath[T] => Unit | Boolean): Self = StObject.set(x, "pre", js.Any.fromFunction1(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
  
  trait TraversalHandlers[T /* <: AstNode */]
    extends StObject
       with SpecificTraversalHandlers {
    
    @JSName("*")
    var Asterisk: js.UndefOr[TraversalCallback[AstNode]] = js.undefined
    
    var init: js.UndefOr[js.Function1[/* ast */ T, Unit]] = js.undefined
    
    var shouldRun: js.UndefOr[js.Function1[/* ast */ T, Boolean]] = js.undefined
  }
  object TraversalHandlers {
    
    inline def apply[T /* <: AstNode */](): TraversalHandlers[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalHandlers[T]]
    }
    
    extension [Self <: TraversalHandlers[?], T /* <: AstNode */](x: Self & TraversalHandlers[T]) {
      
      inline def setAsterisk(value: /* path */ NodePath[AstNode] => Unit | Boolean): Self = StObject.set(x, "*", js.Any.fromFunction1(value))
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setInit(value: /* ast */ T => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setShouldRun(value: /* ast */ T => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction1(value))
      
      inline def setShouldRunUndefined: Self = StObject.set(x, "shouldRun", js.undefined)
    }
  }
}
