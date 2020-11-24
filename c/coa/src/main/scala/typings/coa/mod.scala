package typings.coa

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coa", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Arg: js.UndefOr[scala.Nothing] = js.native
  
  def Cmd(): typings.coa.mod.classes.Cmd = js.native
  def Cmd(cmd: typings.coa.mod.classes.Cmd): typings.coa.mod.classes.Cmd = js.native
  
  val Opt: js.UndefOr[scala.Nothing] = js.native
  
  @js.native
  object classes extends js.Object {
    
    @js.native
    class Arg protected () extends js.Object {
      def this(cmd: Cmd) = this()
      
      @JSName("apply")
      def apply(args: js.Any*): typings.coa.mod.classes.Arg = js.native
      
      def arr(): typings.coa.mod.classes.Arg = js.native
      
      def comp(fn: js.Function1[/* opts */ js.Any, _]): typings.coa.mod.classes.Arg = js.native
      
      def `def`(`def`: js.Any): typings.coa.mod.classes.Arg = js.native
      
      def end(): Cmd = js.native
      
      def input(): typings.coa.mod.classes.Arg = js.native
      
      def name(name: String): typings.coa.mod.classes.Arg = js.native
      
      def output(): typings.coa.mod.classes.Arg = js.native
      
      def reject(args: js.Any*): typings.coa.mod.classes.Arg = js.native
      
      def req(): typings.coa.mod.classes.Arg = js.native
      
      def title(title: String): typings.coa.mod.classes.Arg = js.native
      
      def `val`(validation: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Boolean]): typings.coa.mod.classes.Arg = js.native
    }
    
    @js.native
    class Cmd () extends js.Object {
      def this(cmd: Cmd) = this()
      
      def act(act: js.Function3[/* opts */ js.Any, /* args */ js.Array[_], /* res */ js.Any, _]): Cmd = js.native
      def act(act: js.Function3[/* opts */ js.Any, /* args */ js.Array[_], /* res */ js.Any, _], force: Boolean): Cmd = js.native
      
      def api(): js.Any = js.native
      
      @JSName("apply")
      def apply(fn: js.Function): Cmd = js.native
      @JSName("apply")
      def apply(fn: js.Function, args: js.Array[_]): Cmd = js.native
      
      def arg(): typings.coa.mod.classes.Arg = js.native
      
      def cmd(): Cmd = js.native
      def cmd(cmd: Cmd): Cmd = js.native
      
      def comp(fs: js.Function1[/* opts */ js.Any, _]): Cmd = js.native
      
      def completable(): Cmd = js.native
      
      def `do`(argv: js.Array[String]): js.Any = js.native
      
      def end(): Cmd = js.native
      
      def extendable(): Cmd = js.native
      def extendable(pattern: String): Cmd = js.native
      
      def helpful(): Cmd = js.native
      
      def invoke(): Promise[_] = js.native
      def invoke(cmds: js.UndefOr[scala.Nothing], opts: js.UndefOr[scala.Nothing], args: js.Any): Promise[_] = js.native
      def invoke(cmds: js.UndefOr[scala.Nothing], opts: js.Any): Promise[_] = js.native
      def invoke(cmds: js.UndefOr[scala.Nothing], opts: js.Any, args: js.Any): Promise[_] = js.native
      def invoke(cmds: String): Promise[_] = js.native
      def invoke(cmds: String, opts: js.UndefOr[scala.Nothing], args: js.Any): Promise[_] = js.native
      def invoke(cmds: String, opts: js.Any): Promise[_] = js.native
      def invoke(cmds: String, opts: js.Any, args: js.Any): Promise[_] = js.native
      def invoke(cmds: js.Array[String]): Promise[_] = js.native
      def invoke(cmds: js.Array[String], opts: js.UndefOr[scala.Nothing], args: js.Any): Promise[_] = js.native
      def invoke(cmds: js.Array[String], opts: js.Any): Promise[_] = js.native
      def invoke(cmds: js.Array[String], opts: js.Any, args: js.Any): Promise[_] = js.native
      
      def name(name: String): Cmd = js.native
      
      def opt(): typings.coa.mod.classes.Opt = js.native
      
      def reject(reason: js.Any): Promise[_] = js.native
      
      def run(argv: js.Array[String]): Cmd = js.native
      
      def title(title: String): Cmd = js.native
      
      def usage(): String = js.native
    }
    /* static members */
    @js.native
    object Cmd extends js.Object {
      
      def create(): Cmd = js.native
      def create(cmd: Cmd): Cmd = js.native
    }
    
    @js.native
    class Opt () extends js.Object {
      def this(cmd: Cmd) = this()
      
      def act(act: js.Function3[/* opts */ js.Any, /* args */ js.Array[_], /* res */ js.Any, _]): typings.coa.mod.classes.Opt = js.native
      
      @JSName("apply")
      def apply(args: js.Any*): Unit = js.native
      
      def arr(): typings.coa.mod.classes.Opt = js.native
      
      def comp(fn: js.Function1[/* opts */ js.Any, _]): typings.coa.mod.classes.Opt = js.native
      
      def `def`(`def`: js.Any): typings.coa.mod.classes.Opt = js.native
      
      def end(): Cmd = js.native
      
      def flag(): typings.coa.mod.classes.Opt = js.native
      
      def input(): typings.coa.mod.classes.Opt = js.native
      
      def long(long: String): typings.coa.mod.classes.Opt = js.native
      
      def name(name: String): typings.coa.mod.classes.Opt = js.native
      
      def only(): typings.coa.mod.classes.Opt = js.native
      
      def output(): typings.coa.mod.classes.Opt = js.native
      
      def reject(args: js.Any*): Unit = js.native
      
      def req(): typings.coa.mod.classes.Opt = js.native
      
      def short(short: String): typings.coa.mod.classes.Opt = js.native
      
      def title(title: String): typings.coa.mod.classes.Opt = js.native
      
      def `val`(validation: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Boolean]): typings.coa.mod.classes.Opt = js.native
    }
  }
  
  @js.native
  object shell extends js.Object {
    
    def escape(w: String): String = js.native
    
    def unescape(w: String): String = js.native
  }
}
