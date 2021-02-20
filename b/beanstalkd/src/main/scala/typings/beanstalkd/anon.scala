package typings.beanstalkd

import typings.beanstalkd.mod.BasicReader
import typings.beanstalkd.mod.BasicWriter
import typings.beanstalkd.mod.BeanstalkdCaller
import typings.beanstalkd.mod.BeanstalkdJobStats
import typings.beanstalkd.mod.BeanstalkdProtocol
import typings.beanstalkd.mod.BeanstalkdStats
import typings.beanstalkd.mod.BeanstalkdTubeStats
import typings.beanstalkd.mod.YamlReader
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<beanstalkd.beanstalkd.BeanstalkdClient> */
  @js.native
  trait RequiredBeanstalkdClient extends StObject {
    
    def _command(command: String, args: js.Array[_], writer: BasicWriter, reader: BasicReader): js.Promise[_] = js.native
    def _command(command: String, args: js.Array[_], writer: BasicWriter, reader: YamlReader): js.Promise[_] = js.native
    @JSName("_command")
    var _command_Original: js.Function4[
        /* command */ String, 
        /* args */ js.Array[_], 
        /* writer */ BasicWriter, 
        /* reader */ BasicReader | YamlReader, 
        js.Promise[_]
      ] = js.native
    
    def bury(id: Double, priority: Double): js.Promise[Unit] = js.native
    @JSName("bury")
    var bury_Original: js.Function2[/* id */ Double, /* priority */ Double, js.Promise[Unit]] = js.native
    
    var closed: Boolean = js.native
    
    def connect(): (js.Promise[this.type with BeanstalkdCaller]) with BeanstalkdCaller = js.native
    @JSName("connect")
    var connect_Original: js.Function0[(js.Promise[this.type with BeanstalkdCaller]) with BeanstalkdCaller] = js.native
    
    def delete(id: Double): js.Promise[Unit] = js.native
    @JSName("delete")
    var delete_Original: js.Function1[/* id */ Double, js.Promise[Unit]] = js.native
    
    def destroy(id: Double): js.Promise[Unit] = js.native
    @JSName("destroy")
    var destroy_Original: js.Function1[/* id */ Double, js.Promise[Unit]] = js.native
    
    var host: String = js.native
    
    def ignore(tube: Double): js.Promise[Double] = js.native
    @JSName("ignore")
    var ignore_Original: js.Function1[/* tube */ Double, js.Promise[Double]] = js.native
    
    def kick(maxToKick: Double): js.Promise[Double] = js.native
    
    def kickJob(id: Double): js.Promise[Unit] = js.native
    @JSName("kickJob")
    var kickJob_Original: js.Function1[/* id */ Double, js.Promise[Unit]] = js.native
    
    @JSName("kick")
    var kick_Original: js.Function1[/* maxToKick */ Double, js.Promise[Double]] = js.native
    
    def listTubeUsed(): js.Promise[String] = js.native
    @JSName("listTubeUsed")
    var listTubeUsed_Original: js.Function0[js.Promise[String]] = js.native
    
    def listTubeWatched(): js.Promise[js.Array[String]] = js.native
    @JSName("listTubeWatched")
    var listTubeWatched_Original: js.Function0[js.Promise[js.Array[String]]] = js.native
    
    def listTubes(): js.Promise[js.Array[String]] = js.native
    @JSName("listTubes")
    var listTubes_Original: js.Function0[js.Promise[js.Array[String]]] = js.native
    
    def on(event: String, listeners: (js.Function1[/* repeated */ js.Any, Unit])*): Unit = js.native
    @JSName("on")
    var on_Original: js.Function2[/* event */ String, /* repeated */ js.Function1[/* repeated */ js.Any, Unit], Unit] = js.native
    
    def pauseTube(tube: String, delay: Double): js.Promise[Unit] = js.native
    @JSName("pauseTube")
    var pauseTube_Original: js.Function2[/* tube */ String, /* delay */ Double, js.Promise[Unit]] = js.native
    
    def peek(id: Double): js.Promise[Buffer] = js.native
    
    def peekBuried(): js.Promise[js.Tuple2[String, Buffer]] = js.native
    @JSName("peekBuried")
    var peekBuried_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]] = js.native
    
    def peekDelayed(): js.Promise[js.Tuple2[String, Buffer]] = js.native
    @JSName("peekDelayed")
    var peekDelayed_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]] = js.native
    
    def peekReady(): js.Promise[js.Tuple2[String, Buffer]] = js.native
    @JSName("peekReady")
    var peekReady_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]] = js.native
    
    @JSName("peek")
    var peek_Original: js.Function1[/* id */ Double, js.Promise[Buffer]] = js.native
    
    var port: Double = js.native
    
    var protocol: BeanstalkdProtocol = js.native
    
    def put(priority: Double, delay: Double, ttr: Double): js.Promise[String] = js.native
    def put(priority: Double, delay: Double, ttr: Double, payload: String): js.Promise[String] = js.native
    def put(priority: Double, delay: Double, ttr: Double, payload: Buffer): js.Promise[String] = js.native
    @JSName("put")
    var put_Original: js.Function4[
        /* priority */ Double, 
        /* delay */ Double, 
        /* ttr */ Double, 
        /* payload */ js.UndefOr[String | Buffer], 
        js.Promise[String]
      ] = js.native
    
    def quit(): js.Promise[Unit] = js.native
    @JSName("quit")
    var quit_Original: js.Function0[js.Promise[Unit]] = js.native
    
    def release(id: Double, priority: Double, delay: Double): js.Promise[Unit] = js.native
    @JSName("release")
    var release_Original: js.Function3[/* id */ Double, /* priority */ Double, /* delay */ Double, js.Promise[Unit]] = js.native
    
    def reserve(): js.Promise[js.Tuple2[String, Buffer]] = js.native
    
    def reserveWithTimeout(seconds: Double): js.Promise[Unit] = js.native
    @JSName("reserveWithTimeout")
    var reserveWithTimeout_Original: js.Function1[/* seconds */ Double, js.Promise[Unit]] = js.native
    
    @JSName("reserve")
    var reserve_Original: js.Function0[js.Promise[js.Tuple2[String, Buffer]]] = js.native
    
    def stats(): js.Promise[BeanstalkdStats] = js.native
    
    def statsJob(id: Double): js.Promise[BeanstalkdJobStats] = js.native
    @JSName("statsJob")
    var statsJob_Original: js.Function1[/* id */ Double, js.Promise[BeanstalkdJobStats]] = js.native
    
    def statsTube(tube: String): js.Promise[BeanstalkdTubeStats] = js.native
    @JSName("statsTube")
    var statsTube_Original: js.Function1[/* tube */ String, js.Promise[BeanstalkdTubeStats]] = js.native
    
    @JSName("stats")
    var stats_Original: js.Function0[js.Promise[BeanstalkdStats]] = js.native
    
    def touch(id: Double): js.Promise[Unit] = js.native
    @JSName("touch")
    var touch_Original: js.Function1[/* id */ Double, js.Promise[Unit]] = js.native
    
    def unref(): Unit = js.native
    @JSName("unref")
    var unref_Original: js.Function0[Unit] = js.native
    
    def use(tube: String): js.Promise[String] = js.native
    @JSName("use")
    var use_Original: js.Function1[/* tube */ String, js.Promise[String]] = js.native
    
    def watch(tube: Double): js.Promise[Double] = js.native
    @JSName("watch")
    var watch_Original: js.Function1[/* tube */ Double, js.Promise[Double]] = js.native
  }
}
