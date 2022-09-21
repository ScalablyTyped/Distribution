package typings.acornHl0KT3mL

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.acornHl0KT3mL.anon.Arrow
import typings.acornHl0KT3mL.anon.Bexpr
import typings.acornHl0KT3mL.anon.Call
import typings.acornHl0KT3mL.anon.TypeofParser
import typings.acornHl0KT3mL.mod.Options
import typings.acornHl0KT3mL.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object acornMjsDTsMod {
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Node")
  @js.native
  open class Node protected ()
    extends typings.acornHl0KT3mL.mod.Node {
    def this(parser: typings.acornHl0KT3mL.mod.Parser, pos: Double) = this()
    def this(
      parser: typings.acornHl0KT3mL.mod.Parser,
      pos: Double,
      loc: typings.acornHl0KT3mL.mod.SourceLocation
    ) = this()
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser")
  @js.native
  open class Parser protected ()
    extends typings.acornHl0KT3mL.mod.Parser {
    // state.js
    def this(options: Options, input: String) = this()
    def this(options: Options, input: String, startPos: Double) = this()
  }
  object Parser {
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    // index.js
    /* static member */
    /* was `typeof acorn` */
    // index.js
    /* static member */
    /* was `typeof acorn` */
    object acorn {
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Node")
      @js.native
      open class Node protected ()
        extends typings.acornHl0KT3mL.mod.Node {
        def this(parser: typings.acornHl0KT3mL.mod.Parser, pos: Double) = this()
        def this(
          parser: typings.acornHl0KT3mL.mod.Parser,
          pos: Double,
          loc: typings.acornHl0KT3mL.mod.SourceLocation
        ) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Node")
      @js.native
      def Node: Instantiable3[
            /* parser */ typings.acornHl0KT3mL.mod.Parser, 
            /* pos */ Double, 
            /* loc */ js.UndefOr[typings.acornHl0KT3mL.mod.SourceLocation], 
            typings.acornHl0KT3mL.mod.Node
          ] = js.native
      inline def Node_=(
        x: Instantiable3[
              /* parser */ typings.acornHl0KT3mL.mod.Parser, 
              /* pos */ Double, 
              /* loc */ js.UndefOr[typings.acornHl0KT3mL.mod.SourceLocation], 
              typings.acornHl0KT3mL.mod.Node
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Parser")
      @js.native
      open class Parser protected ()
        extends typings.acornHl0KT3mL.mod.Parser {
        // state.js
        def this(options: Options, input: String) = this()
        def this(options: Options, input: String, startPos: Double) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Parser")
      @js.native
      def Parser: (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acornHl0KT3mL.mod.Parser
          ]) | TypeofParser = js.native
      inline def Parser_=(
        x: (Instantiable3[
              /* options */ Options, 
              /* input */ String, 
              /* startPos */ js.UndefOr[Double], 
              typings.acornHl0KT3mL.mod.Parser
            ]) | TypeofParser
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parser")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.SourceLocation")
      @js.native
      open class SourceLocation protected ()
        extends typings.acornHl0KT3mL.mod.SourceLocation {
        def this(p: typings.acornHl0KT3mL.mod.Parser, start: Position, end: Position) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.SourceLocation")
      @js.native
      def SourceLocation: Instantiable3[
            /* p */ typings.acornHl0KT3mL.mod.Parser, 
            /* start */ Position, 
            /* end */ Position, 
            typings.acornHl0KT3mL.mod.SourceLocation
          ] = js.native
      inline def SourceLocation_=(
        x: Instantiable3[
              /* p */ typings.acornHl0KT3mL.mod.Parser, 
              /* start */ Position, 
              /* end */ Position, 
              typings.acornHl0KT3mL.mod.SourceLocation
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.TokContext")
      @js.native
      open class TokContext protected ()
        extends typings.acornHl0KT3mL.mod.TokContext {
        def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
        def this(
          token: String,
          isExpr: Boolean,
          preserveSpace: Boolean,
          `override`: js.Function1[/* p */ typings.acornHl0KT3mL.mod.Parser, Unit]
        ) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.TokContext")
      @js.native
      def TokContext: Instantiable4[
            /* token */ String, 
            /* isExpr */ Boolean, 
            /* preserveSpace */ Boolean, 
            /* override */ js.UndefOr[js.Function1[/* p */ typings.acornHl0KT3mL.mod.Parser, Unit]], 
            typings.acornHl0KT3mL.mod.TokContext
          ] = js.native
      inline def TokContext_=(
        x: Instantiable4[
              /* token */ String, 
              /* isExpr */ Boolean, 
              /* preserveSpace */ Boolean, 
              /* override */ js.UndefOr[js.Function1[/* p */ typings.acornHl0KT3mL.mod.Parser, Unit]], 
              typings.acornHl0KT3mL.mod.TokContext
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokContext")(x.asInstanceOf[js.Any])
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Token")
      @js.native
      open class Token protected ()
        extends typings.acornHl0KT3mL.mod.Token {
        def this(p: typings.acornHl0KT3mL.mod.Parser) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.Token")
      @js.native
      def Token: Instantiable1[/* p */ typings.acornHl0KT3mL.mod.Parser, typings.acornHl0KT3mL.mod.Token] = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.TokenType")
      @js.native
      open class TokenType protected ()
        extends typings.acornHl0KT3mL.mod.TokenType {
        def this(label: String) = this()
        def this(label: String, conf: Any) = this()
      }
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.TokenType")
      @js.native
      def TokenType: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acornHl0KT3mL.mod.TokenType] = js.native
      inline def TokenType_=(
        x: Instantiable2[/* label */ String, /* conf */ js.UndefOr[Any], typings.acornHl0KT3mL.mod.TokenType]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TokenType")(x.asInstanceOf[js.Any])
      
      inline def Token_=(x: Instantiable1[/* p */ typings.acornHl0KT3mL.mod.Parser, typings.acornHl0KT3mL.mod.Token]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Token")(x.asInstanceOf[js.Any])
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.defaultOptions")
      @js.native
      val defaultOptions: Options = js.native
      
      inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
      
      inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.lineBreak")
      @js.native
      val lineBreak: js.RegExp = js.native
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.lineBreakG")
      @js.native
      val lineBreakG: js.RegExp = js.native
      
      inline def parse(input: String, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
      
      inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.tokContexts")
      @js.native
      val tokContexts: Bexpr = js.native
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.tokTypes")
      @js.native
      val tokTypes: Arrow = js.native
      
      inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
      
      @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Parser.acorn.version")
      @js.native
      val version: String = js.native
    }
    
    /* static member */
    inline def extend(
      plugins: (js.Function1[
          /* BaseParser */ TypeofParser & (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acornHl0KT3mL.mod.Parser
          ]), 
          TypeofParser & (Instantiable3[
            /* options */ Options, 
            /* input */ String, 
            /* startPos */ js.UndefOr[Double], 
            typings.acornHl0KT3mL.mod.Parser
          ])
        ])*
    ): TypeofParser & (Instantiable3[
        /* options */ Options, 
        /* input */ String, 
        /* startPos */ js.UndefOr[Double], 
        typings.acornHl0KT3mL.mod.Parser
      ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TypeofParser & (Instantiable3[
        /* options */ Options, 
        /* input */ String, 
        /* startPos */ js.UndefOr[Double], 
        typings.acornHl0KT3mL.mod.Parser
      ])]
    
    // state.js
    /* static member */
    inline def parse(input: String, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
    
    /* static member */
    inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
    
    /* static member */
    inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "SourceLocation")
  @js.native
  open class SourceLocation protected ()
    extends typings.acornHl0KT3mL.mod.SourceLocation {
    def this(p: typings.acornHl0KT3mL.mod.Parser, start: Position, end: Position) = this()
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "TokContext")
  @js.native
  open class TokContext protected ()
    extends typings.acornHl0KT3mL.mod.TokContext {
    def this(token: String, isExpr: Boolean, preserveSpace: Boolean) = this()
    def this(
      token: String,
      isExpr: Boolean,
      preserveSpace: Boolean,
      `override`: js.Function1[/* p */ typings.acornHl0KT3mL.mod.Parser, Unit]
    ) = this()
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "Token")
  @js.native
  open class Token protected ()
    extends typings.acornHl0KT3mL.mod.Token {
    def this(p: typings.acornHl0KT3mL.mod.Parser) = this()
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "TokenType")
  @js.native
  open class TokenType protected ()
    extends typings.acornHl0KT3mL.mod.TokenType {
    def this(label: String) = this()
    def this(label: String, conf: Any) = this()
  }
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "defaultOptions")
  @js.native
  val defaultOptions: Options = js.native
  
  inline def getLineInfo(input: String, offset: Double): Position = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineInfo")(input.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Position]
  
  inline def isIdentifierChar(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIdentifierChar(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierChar")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIdentifierStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIdentifierStart(code: Double, astral: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(code.asInstanceOf[js.Any], astral.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNewLine(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewLine")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "lineBreak")
  @js.native
  val lineBreak: js.RegExp = js.native
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "lineBreakG")
  @js.native
  val lineBreakG: js.RegExp = js.native
  
  inline def parse(input: String, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
  
  inline def parseExpressionAt(input: String, pos: Double, options: Options): typings.acornHl0KT3mL.mod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExpressionAt")(input.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.acornHl0KT3mL.mod.Node]
  
  object tokContexts {
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.b_expr")
    @js.native
    def bExpr: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def bExpr_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_expr")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.b_stat")
    @js.native
    def bStat: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def bStat_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_stat")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.b_tmpl")
    @js.native
    def bTmpl: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def bTmpl_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b_tmpl")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.f_expr")
    @js.native
    def fExpr: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.f_expr_gen")
    @js.native
    def fExprGen: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def fExprGen_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr_gen")(x.asInstanceOf[js.Any])
    
    inline def fExpr_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_expr")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.f_gen")
    @js.native
    def fGen: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def fGen_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_gen")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.f_stat")
    @js.native
    def fStat: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def fStat_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f_stat")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.p_expr")
    @js.native
    def pExpr: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def pExpr_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_expr")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.p_stat")
    @js.native
    def pStat: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def pStat_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("p_stat")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokContexts.q_tmpl")
    @js.native
    def qTmpl: typings.acornHl0KT3mL.mod.TokContext = js.native
    
    inline def qTmpl_=(x: typings.acornHl0KT3mL.mod.TokContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q_tmpl")(x.asInstanceOf[js.Any])
  }
  
  object tokTypes {
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._default")
    @js.native
    def default: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.arrow")
    @js.native
    def arrow: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def arrow_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrow")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.assign")
    @js.native
    def assign: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def assign_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assign")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.backQuote")
    @js.native
    def backQuote: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def backQuote_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backQuote")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bitShift")
    @js.native
    def bitShift: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bitShift_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitShift")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bitwiseAND")
    @js.native
    def bitwiseAND: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bitwiseAND_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseAND")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bitwiseOR")
    @js.native
    def bitwiseOR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bitwiseOR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseOR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bitwiseXOR")
    @js.native
    def bitwiseXOR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bitwiseXOR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitwiseXOR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.braceL")
    @js.native
    def braceL: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def braceL_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceL")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.braceR")
    @js.native
    def braceR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def braceR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("braceR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bracketL")
    @js.native
    def bracketL: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bracketL_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketL")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.bracketR")
    @js.native
    def bracketR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def bracketR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bracketR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._break")
    @js.native
    def break: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def break_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_break")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._case")
    @js.native
    val `case`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._catch")
    @js.native
    val `catch`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._class")
    @js.native
    val `class`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.coalesce")
    @js.native
    def coalesce: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def coalesce_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coalesce")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.colon")
    @js.native
    def colon: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def colon_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colon")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.comma")
    @js.native
    def comma: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def comma_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comma")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._const")
    @js.native
    def const: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def const_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_const")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._continue")
    @js.native
    def continue: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def continue_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_continue")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._debugger")
    @js.native
    def debugger: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def debugger_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_debugger")(x.asInstanceOf[js.Any])
    
    inline def default_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_default")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._delete")
    @js.native
    def delete: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def delete_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._do")
    @js.native
    val `do`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.dollarBraceL")
    @js.native
    def dollarBraceL: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def dollarBraceL_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dollarBraceL")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.dot")
    @js.native
    def dot: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def dot_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.ellipsis")
    @js.native
    def ellipsis: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def ellipsis_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._else")
    @js.native
    val `else`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.eof")
    @js.native
    def eof: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def eof_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eof")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.eq")
    @js.native
    def eq_ : typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def eq__=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eq")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.equality")
    @js.native
    def equality: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def equality_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equality")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._export")
    @js.native
    val `export`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._extends")
    @js.native
    val `extends`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._false")
    @js.native
    val `false`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._finally")
    @js.native
    val `finally`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._for")
    @js.native
    val `for`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._function")
    @js.native
    def function: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def function_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_function")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._if")
    @js.native
    val `if`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._import")
    @js.native
    val `import`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._in")
    @js.native
    def in: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def in_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_in")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.incDec")
    @js.native
    def incDec: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def incDec_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("incDec")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._instanceof")
    @js.native
    def instanceof: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def instanceof_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceof")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.invalidTemplate")
    @js.native
    def invalidTemplate: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def invalidTemplate_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidTemplate")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.logicalAND")
    @js.native
    def logicalAND: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def logicalAND_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalAND")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.logicalOR")
    @js.native
    def logicalOR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def logicalOR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logicalOR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.modulo")
    @js.native
    def modulo: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def modulo_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulo")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.name")
    @js.native
    def name: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def name_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._new")
    @js.native
    val `new`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._null")
    @js.native
    val `null`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.num")
    @js.native
    def num: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def num_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("num")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.parenL")
    @js.native
    def parenL: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def parenL_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenL")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.parenR")
    @js.native
    def parenR: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def parenR_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parenR")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.plusMin")
    @js.native
    def plusMin: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def plusMin_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plusMin")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.prefix")
    @js.native
    def prefix: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def prefix_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.privateId")
    @js.native
    def privateId: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def privateId_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("privateId")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.question")
    @js.native
    def question: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.questionDot")
    @js.native
    def questionDot: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def questionDot_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("questionDot")(x.asInstanceOf[js.Any])
    
    inline def question_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("question")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.regexp")
    @js.native
    def regexp: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def regexp_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regexp")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.relational")
    @js.native
    def relational: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def relational_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relational")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._return")
    @js.native
    val `return`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.semi")
    @js.native
    def semi: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def semi_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semi")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.slash")
    @js.native
    def slash: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def slash_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slash")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.star")
    @js.native
    def star: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def star_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("star")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.starstar")
    @js.native
    def starstar: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def starstar_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("starstar")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.string")
    @js.native
    def string: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def string_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._super")
    @js.native
    val `super`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._switch")
    @js.native
    def switch: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def switch_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_switch")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes.template")
    @js.native
    def template: typings.acornHl0KT3mL.mod.TokenType = js.native
    inline def template_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._this")
    @js.native
    val `this`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._throw")
    @js.native
    val `throw`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._true")
    @js.native
    val `true`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._try")
    @js.native
    val `try`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._typeof")
    @js.native
    def typeof: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def typeof_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_typeof")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._var")
    @js.native
    val `var`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._void")
    @js.native
    def void: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    inline def void_=(x: typings.acornHl0KT3mL.mod.TokenType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_void")(x.asInstanceOf[js.Any])
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._while")
    @js.native
    val `while`: typings.acornHl0KT3mL.mod.TokenType = js.native
    
    @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "tokTypes._with")
    @js.native
    val `with`: typings.acornHl0KT3mL.mod.TokenType = js.native
  }
  
  inline def tokenizer(input: String, options: Options): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenizer")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  @JSImport(".acorn-Hl0KT3mL/dist/acorn.mjs.d.ts", "version")
  @js.native
  val version: String = js.native
}
