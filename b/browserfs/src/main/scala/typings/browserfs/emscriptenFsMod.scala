package typings.browserfs

import typings.browserfs.anon.Opts
import typings.browserfs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenFsMod {
  
  @JSImport("browserfs/dist/node/generic/emscripten_fs", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BFSEmscriptenFS {
    def this(_FS: Any) = this()
    def this(_FS: Any, _PATH: Any) = this()
    def this(_FS: Unit, _PATH: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Unit, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Unit, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any, nodefs: typings.browserfs.fSMod.default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: typings.browserfs.fSMod.default) = this()
  }
  
  @js.native
  trait BFSEmscriptenFS
    extends StObject
       with EmscriptenFS {
    
    /* private */ var ERRNO_CODES: Any = js.native
    
    /* private */ var FS: Any = js.native
    
    /* private */ var PATH: Any = js.native
    
    def createNode(parent: Null, name: String, mode: Double): EmscriptenFSNode = js.native
    def createNode(parent: Null, name: String, mode: Double, dev: Any): EmscriptenFSNode = js.native
    
    def flagsToPermissionString(flags: String): String = js.native
    def flagsToPermissionString(flags: Double): String = js.native
    
    var flagsToPermissionStringMap: `0` = js.native
    
    def getERRNO_CODES(): Any = js.native
    
    def getFS(): Any = js.native
    
    def getNodeFS(): typings.browserfs.fSMod.default = js.native
    
    def getPATH(): Any = js.native
    
    /* private */ var nodefs: Any = js.native
  }
  
  @js.native
  trait EmscriptenFS extends StObject {
    
    def createNode(parent: EmscriptenFSNode, name: String, mode: Double): EmscriptenFSNode = js.native
    def createNode(parent: EmscriptenFSNode, name: String, mode: Double, dev: Any): EmscriptenFSNode = js.native
    
    def getMode(path: String): Double = js.native
    
    def mount(mount: Opts): EmscriptenFSNode = js.native
    
    var node_ops: EmscriptenNodeOps = js.native
    
    def realPath(node: EmscriptenFSNode): String = js.native
    
    var stream_ops: EmscriptenStreamOps = js.native
  }
  
  trait EmscriptenFSNode extends StObject {
    
    var mode: Double
    
    var mount: Opts
    
    var name: String
    
    var node_ops: EmscriptenNodeOps
    
    var parent: EmscriptenFSNode
    
    var stream_ops: EmscriptenStreamOps
  }
  object EmscriptenFSNode {
    
    inline def apply(
      mode: Double,
      mount: Opts,
      name: String,
      node_ops: EmscriptenNodeOps,
      parent: EmscriptenFSNode,
      stream_ops: EmscriptenStreamOps
    ): EmscriptenFSNode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_ops = node_ops.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], stream_ops = stream_ops.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenFSNode]
    }
    
    extension [Self <: EmscriptenFSNode](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMount(value: Opts): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode_ops(value: EmscriptenNodeOps): Self = StObject.set(x, "node_ops", value.asInstanceOf[js.Any])
      
      inline def setParent(value: EmscriptenFSNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setStream_ops(value: EmscriptenStreamOps): Self = StObject.set(x, "stream_ops", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmscriptenNodeOps extends StObject {
    
    def getattr(node: EmscriptenFSNode): Stats
    
    def lookup(parent: EmscriptenFSNode, name: String): EmscriptenFSNode
    
    def mknod(parent: EmscriptenFSNode, name: String, mode: Double, dev: Any): EmscriptenFSNode
    
    def readdir(node: EmscriptenFSNode): js.Array[String]
    
    def readlink(node: EmscriptenFSNode): String
    
    def rename(oldNode: EmscriptenFSNode, newDir: EmscriptenFSNode, newName: String): Unit
    
    def rmdir(parent: EmscriptenFSNode, name: String): Unit
    
    def setattr(node: EmscriptenFSNode, attr: Stats): Unit
    
    def symlink(parent: EmscriptenFSNode, newName: String, oldPath: String): Unit
    
    def unlink(parent: EmscriptenFSNode, name: String): Unit
  }
  object EmscriptenNodeOps {
    
    inline def apply(
      getattr: EmscriptenFSNode => Stats,
      lookup: (EmscriptenFSNode, String) => EmscriptenFSNode,
      mknod: (EmscriptenFSNode, String, Double, Any) => EmscriptenFSNode,
      readdir: EmscriptenFSNode => js.Array[String],
      readlink: EmscriptenFSNode => String,
      rename: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit,
      rmdir: (EmscriptenFSNode, String) => Unit,
      setattr: (EmscriptenFSNode, Stats) => Unit,
      symlink: (EmscriptenFSNode, String, String) => Unit,
      unlink: (EmscriptenFSNode, String) => Unit
    ): EmscriptenNodeOps = {
      val __obj = js.Dynamic.literal(getattr = js.Any.fromFunction1(getattr), lookup = js.Any.fromFunction2(lookup), mknod = js.Any.fromFunction4(mknod), readdir = js.Any.fromFunction1(readdir), readlink = js.Any.fromFunction1(readlink), rename = js.Any.fromFunction3(rename), rmdir = js.Any.fromFunction2(rmdir), setattr = js.Any.fromFunction2(setattr), symlink = js.Any.fromFunction3(symlink), unlink = js.Any.fromFunction2(unlink))
      __obj.asInstanceOf[EmscriptenNodeOps]
    }
    
    extension [Self <: EmscriptenNodeOps](x: Self) {
      
      inline def setGetattr(value: EmscriptenFSNode => Stats): Self = StObject.set(x, "getattr", js.Any.fromFunction1(value))
      
      inline def setLookup(value: (EmscriptenFSNode, String) => EmscriptenFSNode): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
      
      inline def setMknod(value: (EmscriptenFSNode, String, Double, Any) => EmscriptenFSNode): Self = StObject.set(x, "mknod", js.Any.fromFunction4(value))
      
      inline def setReaddir(value: EmscriptenFSNode => js.Array[String]): Self = StObject.set(x, "readdir", js.Any.fromFunction1(value))
      
      inline def setReadlink(value: EmscriptenFSNode => String): Self = StObject.set(x, "readlink", js.Any.fromFunction1(value))
      
      inline def setRename(value: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction3(value))
      
      inline def setRmdir(value: (EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "rmdir", js.Any.fromFunction2(value))
      
      inline def setSetattr(value: (EmscriptenFSNode, Stats) => Unit): Self = StObject.set(x, "setattr", js.Any.fromFunction2(value))
      
      inline def setSymlink(value: (EmscriptenFSNode, String, String) => Unit): Self = StObject.set(x, "symlink", js.Any.fromFunction3(value))
      
      inline def setUnlink(value: (EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "unlink", js.Any.fromFunction2(value))
    }
  }
  
  trait EmscriptenStream extends StObject {
    
    var flags: String
    
    var nfd: Any
    
    var node: EmscriptenFSNode
    
    var position: Double
  }
  object EmscriptenStream {
    
    inline def apply(flags: String, nfd: Any, node: EmscriptenFSNode, position: Double): EmscriptenStream = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenStream]
    }
    
    extension [Self <: EmscriptenStream](x: Self) {
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setNfd(value: Any): Self = StObject.set(x, "nfd", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EmscriptenFSNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmscriptenStreamOps extends StObject {
    
    def close(stream: EmscriptenStream): Unit
    
    def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double
    
    def open(stream: EmscriptenStream): Unit
    
    def read(
      stream: EmscriptenStream,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Double
    ): Double
    
    def write(
      stream: EmscriptenStream,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Double
    ): Double
  }
  object EmscriptenStreamOps {
    
    inline def apply(
      close: EmscriptenStream => Unit,
      llseek: (EmscriptenStream, Double, Double) => Double,
      open: EmscriptenStream => Unit,
      read: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double,
      write: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double
    ): EmscriptenStreamOps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), llseek = js.Any.fromFunction3(llseek), open = js.Any.fromFunction1(open), read = js.Any.fromFunction5(read), write = js.Any.fromFunction5(write))
      __obj.asInstanceOf[EmscriptenStreamOps]
    }
    
    extension [Self <: EmscriptenStreamOps](x: Self) {
      
      inline def setClose(value: EmscriptenStream => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setLlseek(value: (EmscriptenStream, Double, Double) => Double): Self = StObject.set(x, "llseek", js.Any.fromFunction3(value))
      
      inline def setOpen(value: EmscriptenStream => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setRead(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = StObject.set(x, "read", js.Any.fromFunction5(value))
      
      inline def setWrite(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = StObject.set(x, "write", js.Any.fromFunction5(value))
    }
  }
  
  trait Stats extends StObject {
    
    var atime: js.Date
    
    var blksize: Double
    
    var blocks: Double
    
    var ctime: js.Date
    
    var dev: Double
    
    var gid: Double
    
    var ino: Double
    
    var mode: Double
    
    var mtime: js.Date
    
    var nlink: Double
    
    var rdev: Double
    
    var size: Double
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var uid: Double
  }
  object Stats {
    
    inline def apply(
      atime: js.Date,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mode: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
