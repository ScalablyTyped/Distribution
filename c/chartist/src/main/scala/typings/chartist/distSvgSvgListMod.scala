package typings.chartist

import typings.chartist.distEventMod.EventEmitter
import typings.chartist.distSvgSvgMod.Svg
import typings.chartist.distSvgTypesMod.AnimationDefinition
import typings.chartist.distSvgTypesMod.Attributes
import typings.std.ArrayLike
import typings.std.Element
import typings.std.Node
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgSvgListMod {
  
  @JSImport("chartist/dist/svg/SvgList", "SvgList")
  @js.native
  open class SvgList protected ()
    extends StObject
       with SvgListMethods {
    /**
      * @param nodeList An Array of SVG DOM nodes or a SVG DOM NodeList (as returned by document.querySelectorAll)
      */
    def this(nodeList: ArrayLike[Element]) = this()
    
    /* CompleteClass */
    override def Easing(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.UndefOr[Any]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("Easing")
    var Easing_Original: js.Function1[/* args */ Parameters[js.UndefOr[Any]], SvgList] = js.native
    
    /* CompleteClass */
    override def _node(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[Any]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("_node")
    var _node_Original: js.Function1[/* args */ Parameters[Any], SvgList] = js.native
    
    /* CompleteClass */
    override def addClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* names */ String, this.type]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("addClass")
    var addClass_Original: js.Function1[/* args */ Parameters[js.Function1[/* names */ String, this.type]], SvgList] = js.native
    
    /* CompleteClass */
    override def animate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function3[
            /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
            /* guided */ js.UndefOr[Boolean], 
            /* eventEmitter */ js.UndefOr[EventEmitter], 
            this.type
          ]
        ]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("animate")
    var animate_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
            /* guided */ js.UndefOr[Boolean], 
            /* eventEmitter */ js.UndefOr[EventEmitter], 
            this.type
          ]
        ], 
        SvgList
      ] = js.native
    
    /* CompleteClass */
    override def attr(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
        ]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("attr")
    var attr_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
        ], 
        SvgList
      ] = js.native
    
    /* private */ var call: Any = js.native
    
    /* CompleteClass */
    override def elem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function4[
            /* name */ String, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("elem")
    var elem_Original: js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* name */ String, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ], 
        SvgList
      ] = js.native
    
    /* CompleteClass */
    override def empty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[this.type]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("empty")
    var empty_Original: js.Function1[/* args */ Parameters[js.Function0[this.type]], SvgList] = js.native
    
    /* CompleteClass */
    override def foreignObject(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function4[
            /* content */ String | Node, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("foreignObject")
    var foreignObject_Original: js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* content */ String | Node, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ], 
        SvgList
      ] = js.native
    
    /* CompleteClass */
    override def getNode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Element]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("getNode")
    var getNode_Original: js.Function1[/* args */ Parameters[js.Function0[Element]], SvgList] = js.native
    
    /* CompleteClass */
    override def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Svg | Null]]
    ): SvgList = js.native
    
    /* CompleteClass */
    override def removeAllClasses(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[this.type]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("removeAllClasses")
    var removeAllClasses_Original: js.Function1[/* args */ Parameters[js.Function0[this.type]], SvgList] = js.native
    
    /* CompleteClass */
    override def removeClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* names */ String, this.type]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("removeClass")
    var removeClass_Original: js.Function1[/* args */ Parameters[js.Function1[/* names */ String, this.type]], SvgList] = js.native
    
    /* CompleteClass */
    @JSName("remove")
    var remove_Original: js.Function1[/* args */ Parameters[js.Function0[Svg | Null]], SvgList] = js.native
    
    /* CompleteClass */
    override def root(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Svg]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("root")
    var root_Original: js.Function1[/* args */ Parameters[js.Function0[Svg]], SvgList] = js.native
    
    /* private */ var svgElements: Any = js.native
    
    /* CompleteClass */
    override def text(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* t */ String, this.type]]
    ): SvgList = js.native
    /* CompleteClass */
    @JSName("text")
    var text_Original: js.Function1[/* args */ Parameters[js.Function1[/* t */ String, this.type]], SvgList] = js.native
  }
  
  /* Inlined {[ method in chartist.chartist/dist/svg/SvgList.SvgMethods ]: (args : std.Parameters<chartist.chartist/dist/svg/Svg.Svg[method]>): chartist.chartist/dist/svg/SvgList.SvgList} */
  trait SvgListMethods extends StObject {
    
    def Easing(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.UndefOr[Any]]
    ): SvgList
    @JSName("Easing")
    var Easing_Original: js.Function1[/* args */ Parameters[js.UndefOr[Any]], SvgList]
    
    def _node(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[Any]
    ): SvgList
    @JSName("_node")
    var _node_Original: js.Function1[/* args */ Parameters[Any], SvgList]
    
    def addClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* names */ String, this.type]]
    ): SvgList
    @JSName("addClass")
    var addClass_Original: js.Function1[/* args */ Parameters[js.Function1[/* names */ String, this.type]], SvgList]
    
    def animate(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function3[
            /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
            /* guided */ js.UndefOr[Boolean], 
            /* eventEmitter */ js.UndefOr[EventEmitter], 
            this.type
          ]
        ]
    ): SvgList
    @JSName("animate")
    var animate_Original: js.Function1[
        /* args */ Parameters[
          js.Function3[
            /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
            /* guided */ js.UndefOr[Boolean], 
            /* eventEmitter */ js.UndefOr[EventEmitter], 
            this.type
          ]
        ], 
        SvgList
      ]
    
    def attr(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
        ]
    ): SvgList
    @JSName("attr")
    var attr_Original: js.Function1[
        /* args */ Parameters[
          js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
        ], 
        SvgList
      ]
    
    def elem(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function4[
            /* name */ String, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ]
    ): SvgList
    @JSName("elem")
    var elem_Original: js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* name */ String, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ], 
        SvgList
      ]
    
    def empty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[this.type]]
    ): SvgList
    @JSName("empty")
    var empty_Original: js.Function1[/* args */ Parameters[js.Function0[this.type]], SvgList]
    
    def foreignObject(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[
          js.Function4[
            /* content */ String | Node, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ]
    ): SvgList
    @JSName("foreignObject")
    var foreignObject_Original: js.Function1[
        /* args */ Parameters[
          js.Function4[
            /* content */ String | Node, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ], 
        SvgList
      ]
    
    def getNode(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Element]]
    ): SvgList
    @JSName("getNode")
    var getNode_Original: js.Function1[/* args */ Parameters[js.Function0[Element]], SvgList]
    
    def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Svg | Null]]
    ): SvgList
    
    def removeAllClasses(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[this.type]]
    ): SvgList
    @JSName("removeAllClasses")
    var removeAllClasses_Original: js.Function1[/* args */ Parameters[js.Function0[this.type]], SvgList]
    
    def removeClass(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* names */ String, this.type]]
    ): SvgList
    @JSName("removeClass")
    var removeClass_Original: js.Function1[/* args */ Parameters[js.Function1[/* names */ String, this.type]], SvgList]
    
    @JSName("remove")
    var remove_Original: js.Function1[/* args */ Parameters[js.Function0[Svg | Null]], SvgList]
    
    def root(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function0[Svg]]
    ): SvgList
    @JSName("root")
    var root_Original: js.Function1[/* args */ Parameters[js.Function0[Svg]], SvgList]
    
    def text(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Svg[method]> is not an array type */ args: Parameters[js.Function1[/* t */ String, this.type]]
    ): SvgList
    @JSName("text")
    var text_Original: js.Function1[/* args */ Parameters[js.Function1[/* t */ String, this.type]], SvgList]
  }
  object SvgListMethods {
    
    inline def apply(
      Easing: /* args */ Parameters[js.UndefOr[Any]] => SvgList,
      _node: /* args */ Parameters[Any] => SvgList,
      addClass: /* args */ Parameters[js.Function1[/* names */ String, SvgListMethods]] => SvgList,
      animate: /* args */ Parameters[
          js.Function3[
            /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
            /* guided */ js.UndefOr[Boolean], 
            /* eventEmitter */ js.UndefOr[EventEmitter], 
            SvgListMethods
          ]
        ] => SvgList,
      attr: /* args */ Parameters[
          js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
        ] => SvgList,
      elem: /* args */ Parameters[
          js.Function4[
            /* name */ String, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ] => SvgList,
      empty: /* args */ Parameters[js.Function0[SvgListMethods]] => SvgList,
      foreignObject: /* args */ Parameters[
          js.Function4[
            /* content */ String | Node, 
            /* attributes */ js.UndefOr[Attributes], 
            /* className */ js.UndefOr[String], 
            /* insertFirst */ js.UndefOr[Boolean], 
            Svg
          ]
        ] => SvgList,
      getNode: /* args */ Parameters[js.Function0[Element]] => SvgList,
      remove: /* args */ Parameters[js.Function0[Svg | Null]] => SvgList,
      removeAllClasses: /* args */ Parameters[js.Function0[SvgListMethods]] => SvgList,
      removeClass: /* args */ Parameters[js.Function1[/* names */ String, SvgListMethods]] => SvgList,
      root: /* args */ Parameters[js.Function0[Svg]] => SvgList,
      text: /* args */ Parameters[js.Function1[/* t */ String, SvgListMethods]] => SvgList
    ): SvgListMethods = {
      val __obj = js.Dynamic.literal(Easing = js.Any.fromFunction1(Easing), _node = js.Any.fromFunction1(_node), addClass = js.Any.fromFunction1(addClass), animate = js.Any.fromFunction1(animate), attr = js.Any.fromFunction1(attr), elem = js.Any.fromFunction1(elem), empty = js.Any.fromFunction1(empty), foreignObject = js.Any.fromFunction1(foreignObject), getNode = js.Any.fromFunction1(getNode), remove = js.Any.fromFunction1(remove), removeAllClasses = js.Any.fromFunction1(removeAllClasses), removeClass = js.Any.fromFunction1(removeClass), root = js.Any.fromFunction1(root), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[SvgListMethods]
    }
    
    extension [Self <: SvgListMethods](x: Self) {
      
      inline def setAddClass(value: /* args */ Parameters[js.Function1[/* names */ String, SvgListMethods]] => SvgList): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
      
      inline def setAnimate(
        value: /* args */ Parameters[
              js.Function3[
                /* animations */ Record[String, AnimationDefinition | js.Array[AnimationDefinition]], 
                /* guided */ js.UndefOr[Boolean], 
                /* eventEmitter */ js.UndefOr[EventEmitter], 
                SvgListMethods
              ]
            ] => SvgList
      ): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setAttr(
        value: /* args */ Parameters[
              js.Function2[/* attributes */ String, /* ns */ js.UndefOr[String], String | Null]
            ] => SvgList
      ): Self = StObject.set(x, "attr", js.Any.fromFunction1(value))
      
      inline def setEasing(value: /* args */ Parameters[js.UndefOr[Any]] => SvgList): Self = StObject.set(x, "Easing", js.Any.fromFunction1(value))
      
      inline def setElem(
        value: /* args */ Parameters[
              js.Function4[
                /* name */ String, 
                /* attributes */ js.UndefOr[Attributes], 
                /* className */ js.UndefOr[String], 
                /* insertFirst */ js.UndefOr[Boolean], 
                Svg
              ]
            ] => SvgList
      ): Self = StObject.set(x, "elem", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: /* args */ Parameters[js.Function0[SvgListMethods]] => SvgList): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      inline def setForeignObject(
        value: /* args */ Parameters[
              js.Function4[
                /* content */ String | Node, 
                /* attributes */ js.UndefOr[Attributes], 
                /* className */ js.UndefOr[String], 
                /* insertFirst */ js.UndefOr[Boolean], 
                Svg
              ]
            ] => SvgList
      ): Self = StObject.set(x, "foreignObject", js.Any.fromFunction1(value))
      
      inline def setGetNode(value: /* args */ Parameters[js.Function0[Element]] => SvgList): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
      
      inline def setRemove(value: /* args */ Parameters[js.Function0[Svg | Null]] => SvgList): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAllClasses(value: /* args */ Parameters[js.Function0[SvgListMethods]] => SvgList): Self = StObject.set(x, "removeAllClasses", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: /* args */ Parameters[js.Function1[/* names */ String, SvgListMethods]] => SvgList): Self = StObject.set(x, "removeClass", js.Any.fromFunction1(value))
      
      inline def setRoot(value: /* args */ Parameters[js.Function0[Svg]] => SvgList): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
      
      inline def setText(value: /* args */ Parameters[js.Function1[/* t */ String, SvgListMethods]] => SvgList): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def set_node(value: /* args */ Parameters[Any] => SvgList): Self = StObject.set(x, "_node", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Exclude<keyof chartist.chartist/dist/svg/Svg.Svg, 'constructor' | 'parent' | 'querySelector' | 'querySelectorAll' | 'replace' | 'append' | 'classes' | 'height' | 'width'> */
  /* Rewritten from type alias, can be one of: 
    - typings.chartist.chartistStrings._node
    - typings.chartist.chartistStrings.attr
    - typings.chartist.chartistStrings.root
    - typings.chartist.chartistStrings.foreignObject
    - typings.chartist.chartistStrings.removeAllClasses
    - typings.chartist.chartistStrings.remove
    - typings.chartist.chartistStrings.getNode
    - typings.chartist.chartistStrings.empty
    - typings.chartist.chartistStrings.text
    - typings.chartist.chartistStrings.removeClass
    - typings.chartist.chartistStrings.Easing
    - typings.chartist.chartistStrings.addClass
    - typings.chartist.chartistStrings.elem
    - typings.chartist.chartistStrings.animate
  */
  trait SvgMethods extends StObject
  object SvgMethods {
    
    inline def Easing: typings.chartist.chartistStrings.Easing = "Easing".asInstanceOf[typings.chartist.chartistStrings.Easing]
    
    inline def _node: typings.chartist.chartistStrings._node = "_node".asInstanceOf[typings.chartist.chartistStrings._node]
    
    inline def addClass: typings.chartist.chartistStrings.addClass = "addClass".asInstanceOf[typings.chartist.chartistStrings.addClass]
    
    inline def animate: typings.chartist.chartistStrings.animate = "animate".asInstanceOf[typings.chartist.chartistStrings.animate]
    
    inline def attr: typings.chartist.chartistStrings.attr = "attr".asInstanceOf[typings.chartist.chartistStrings.attr]
    
    inline def elem: typings.chartist.chartistStrings.elem = "elem".asInstanceOf[typings.chartist.chartistStrings.elem]
    
    inline def empty: typings.chartist.chartistStrings.empty = "empty".asInstanceOf[typings.chartist.chartistStrings.empty]
    
    inline def foreignObject: typings.chartist.chartistStrings.foreignObject = "foreignObject".asInstanceOf[typings.chartist.chartistStrings.foreignObject]
    
    inline def getNode: typings.chartist.chartistStrings.getNode = "getNode".asInstanceOf[typings.chartist.chartistStrings.getNode]
    
    inline def remove: typings.chartist.chartistStrings.remove = "remove".asInstanceOf[typings.chartist.chartistStrings.remove]
    
    inline def removeAllClasses: typings.chartist.chartistStrings.removeAllClasses = "removeAllClasses".asInstanceOf[typings.chartist.chartistStrings.removeAllClasses]
    
    inline def removeClass: typings.chartist.chartistStrings.removeClass = "removeClass".asInstanceOf[typings.chartist.chartistStrings.removeClass]
    
    inline def root: typings.chartist.chartistStrings.root = "root".asInstanceOf[typings.chartist.chartistStrings.root]
    
    inline def text: typings.chartist.chartistStrings.text = "text".asInstanceOf[typings.chartist.chartistStrings.text]
  }
}
