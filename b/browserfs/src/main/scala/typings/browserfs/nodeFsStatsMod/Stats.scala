package typings.browserfs.nodeFsStatsMod

import typings.node.Buffer
import typings.node.fsMod.StatsBase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends StatsBase[Double] {
  var fileData: Buffer | Null = js.native
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  def chmod(mode: Double): Unit = js.native
  def toBuffer(): Buffer = js.native
}

object Stats {
  @scala.inline
  def apply(
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    chmod: Double => Unit,
    ctime: Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    mtimeMs: Double,
    nlink: Double,
    rdev: Double,
    size: Double,
    toBuffer: () => Buffer,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], chmod = js.Any.fromFunction1(chmod), ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer), uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChmod(value: Double => Unit): Self = this.set("chmod", js.Any.fromFunction1(value))
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setFileData(value: Buffer): Self = this.set("fileData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDataNull: Self = this.set("fileData", null)
  }
  
}

